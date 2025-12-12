#!/usr/bin/env python3
"""
generator.py

Generates a daily set of Java Q&A using the OpenAI API and writes a dated Markdown file under `questions/`.

Environment variables:
- OPENAI_API_KEY (required)
- OUTPUT_DIR      (optional, default "questions")
- NUM_QA          (optional, default 5)
- OPENAI_MODEL    (optional, default "gpt-4o") -- change if your account uses a different model
"""

import os
import sys
import json
import datetime
import time
import re
from typing import List, Dict

try:
    import openai
except Exception as e:
    print("Missing dependency 'openai'. Install with: pip install -r requirements.txt", file=sys.stderr)
    raise

OPENAI_API_KEY = os.getenv("OPENAI_API_KEY")
if not OPENAI_API_KEY:
    print("ERROR: OPENAI_API_KEY environment variable is required.", file=sys.stderr)
    sys.exit(2)

openai.api_key = OPENAI_API_KEY

OUTPUT_DIR = os.getenv("OUTPUT_DIR", "questions")
NUM_QA = int(os.getenv("NUM_QA", "5"))
MODEL_NAME = os.getenv("OPENAI_MODEL", "gpt-4o")
TEMPERATURE = float(os.getenv("OPENAI_TEMPERATURE", "0.25"))

PROMPT = f"""
You are an expert Java teacher. Produce exactly {NUM_QA} question-and-answer pairs about Java.
Mix difficulties: at least one "basic", at least two "intermediate", and at least one "advanced".
For each item include:
- id (short string)
- difficulty (basic|intermediate|advanced)
- tags (array of short tag words)
- question (clear concise question)
- answer (complete but reasonably concise; include code samples when helpful; keep code fenced with triple backticks)
- explanation (1-3 short sentences explaining the answer when applicable)

Return ONLY valid JSON in this exact schema (no extra text):
{{
  "items": [
    {{
      "id": "string",
      "difficulty": "basic|intermediate|advanced",
      "tags": ["tag1","tag2"],
      "question": "string",
      "answer": "string",
      "explanation": "string"
    }},
    ...
  ]
}}
Ensure the JSON is parseable. Do not add commentary outside the JSON.
"""

def call_openai(prompt: str, model: str = MODEL_NAME, retries=4, backoff=2) -> Dict:
    last_exc = None
    for attempt in range(retries):
        try:
            resp = openai.ChatCompletion.create(
                model=model,
                messages=[
                    {"role": "system", "content": "You are a helpful assistant that returns strict JSON."},
                    {"role": "user", "content": prompt}
                ],
                max_tokens=1600,
                temperature=TEMPERATURE,
            )
            content = resp["choices"][0]["message"]["content"]
            # Attempt to parse JSON directly; if there is stray text, try to extract the JSON object substring
            try:
                return json.loads(content)
            except Exception:
                # Extract first {...} block
                m = re.search(r'(\{.*\})', content, flags=re.DOTALL)
                if m:
                    candidate = m.group(1)
                    try:
                        return json.loads(candidate)
                    except Exception as e:
                        print(f"[warning] JSON parse failed on extracted block: {e}", file=sys.stderr)
                        print("Model output (truncated):", file=sys.stderr)
                        print(content[:1000], file=sys.stderr)
                        raise
                else:
                    print("[warning] No JSON object found in model output.", file=sys.stderr)
                    print("Model output (truncated):", file=sys.stderr)
                    print(content[:1000], file=sys.stderr)
                    raise ValueError("No JSON returned by model")
        except Exception as e:
            last_exc = e
            print(f"[warning] attempt {attempt+1} failed: {e}", file=sys.stderr)
            if attempt < retries - 1:
                time.sleep(backoff * (2 ** attempt))
            else:
                break
    raise RuntimeError("OpenAI request failed") from last_exc

def render_markdown(items: List[Dict]) -> str:
    date = datetime.date.today().isoformat()
    header = f"# Java Q&A — {date}\n\n_Generated automatically_\n\n"
    body = []
    for idx, it in enumerate(items, start=1):
        q = it.get("question", "").strip()
        body.append(f"## {idx}. {q}\n\n")
        body.append(f"**Difficulty:** {it.get('difficulty','')}\n\n")
        tags = it.get("tags", [])
        if tags:
            body.append(f"**Tags:** {', '.join(tags)}\n\n")
        body.append("**Answer:**\n\n")
        answer = it.get("answer", "").strip()
        # Ensure code fences preserved
        body.append(f"{answer}\n\n")
        explanation = it.get("explanation", "").strip()
        if explanation:
            body.append(f"**Explanation:** {explanation}\n\n")
        body.append("---\n\n")
    return header + "".join(body)

def ensure_dir(path: str):
    os.makedirs(path, exist_ok=True)

def main():
    ensure_dir(OUTPUT_DIR)
    print(f"[info] Requesting {NUM_QA} Q&A from OpenAI...")
    data = call_openai(PROMPT)
    items = data.get("items", [])
    if not items:
        print("ERROR: No items returned by the model.", file=sys.stderr)
        sys.exit(3)
    md = render_markdown(items)
    filename = datetime.date.today().isoformat() + ".md"
    outpath = os.path.join(OUTPUT_DIR, filename)
    # avoid overwrite; if exists, append timestamp
    if os.path.exists(outpath):
        ts = datetime.datetime.now().strftime("%H%M%S")
        outpath = os.path.join(OUTPUT_DIR, datetime.date.today().isoformat() + f"_{ts}.md")
    with open(outpath, "w", encoding="utf-8") as f:
        f.write(md)
    print(f"[info] Wrote file: {outpath}")
    # also print relative path for GitHub Actions usage
    print(outpath)

if __name__ == "__main__":
    main()
