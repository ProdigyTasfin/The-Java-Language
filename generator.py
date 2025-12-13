import json
import os
import datetime
os.makedirs("questions", exist_ok=True)


BANK_FILE = "questions_bank.json"
PROGRESS_FILE = "progress.json"
OUTPUT_DIR = "questions"
NUM_QA = 5

TOPIC_BY_DAY = {
    0: "basics",
    1: "loops",
    2: "oop",
    3: "collections",
    4: "multithreading",
    5: "dsa",
    6: "mixed"
}

def main():
    today = datetime.date.today()
    weekday = today.weekday()
    topic_today = TOPIC_BY_DAY[weekday]

    with open(BANK_FILE, "r") as f:
        bank = json.load(f)["items"]

    with open(PROGRESS_FILE, "r") as f:
        progress = json.load(f)

    used = progress.get("used_ids", [])
    candidates = [q for q in bank if q["id"] not in used and
                  (q["topic"] == topic_today or topic_today == "mixed")]

    selected = candidates[:NUM_QA]

    if not selected:
        print("No more questions available for today.")
        return

    os.makedirs(OUTPUT_DIR, exist_ok=True)
    file = f"{OUTPUT_DIR}/{today}.md"

    with open(file, "w") as f:
        f.write(f"# Java Daily Problems — {today}\n")
        f.write(f"## Topic: {topic_today.upper()}\n\n")
        f.write("_Solve first. Solutions will appear tomorrow._\n\n")

        for i, q in enumerate(selected, 1):
            f.write(f"### {i}. {q['question']}\n\n")
            if q["type"] == "code":
                f.write("```java\n")
                f.write(q["starter_code"])
                f.write("\n```\n\n")
            f.write("---\n\n")
            used.append(q["id"])

    progress["used_ids"] = used
    with open(PROGRESS_FILE, "w") as f:
        json.dump(progress, f, indent=2)

    print("Generated:", file)

if __name__ == "__main__":
    main()
