//Suppose that a and b are int values. Simplify the following expression: (!(a < b) && !(a > b))

public class Question_01 {
    public static void main(String[] args) {
        // Original expression: (!(a < b) && !(a > b))
        // This expression checks if 'a' is neither less than 'b' nor greater than 'b',
        // which means 'a' must be equal to 'b'.

        // Simplified expression:
        int a = 5;
        int b = 5;

        boolean result = (a == b); // Simplified expression
        System.out.println("The result of the simplified expression (a == b) is: " + result);
    }
}
