import java.util.Scanner;
public class palindrome_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        String reversed = new StringBuilder(original).reverse().toString(); //explanation: This line creates a new StringBuilder object initialized with the original string, reverses it using the reverse() method, and then converts it back to a String using toString().
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        scanner.close();
    }
}
