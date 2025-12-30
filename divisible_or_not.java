import java.util.Scanner;

public class divisible_or_not {
    public static void main(String[] args) {
        int number; // You can change this number to test
        System.out.print("Enter your number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2.");
        } else {
            System.out.println(number + " is not divisible by 2.");
        }
    }
}
