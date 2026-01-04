public class what_will_be_the_output {
    public static void main(String[] args) {
        short s1 = 10;
        short s2 = 20;
        short s3 = (s1 + s2); 
        
        
        System.out.println(s3);
        
        // A) 30
        // B) Compilation Error
        // C) Runtime Error
        // D) 10
        
        // Correct Answer: B) Compilation Error
        // Explanation: In Java, the result of adding two short variables is promoted to an int
        // type. Therefore, assigning the result back to a short variable without explicit casting
        // causes a compilation error.
        // short + short = int
        // int s3 = s1 + s2; This will work fine
        
        // This line will cause a compilation error

        // Solve: short s3 = (short)(s1 + s2);
        // Output: 30 
    }
}