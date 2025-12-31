// You are in the Helfin, ALA, USA 
// A user is asking you to tell them, Is it cold or hot outside?
// If it is 10 degrees or below, it is considered cold.
// If it is 25 degrees or above, it is considered hot.
// If it is between 11 and 24 degrees, it is considered mild.

import java.util.Scanner;

public class logical_Operators_example {
    public static void main(String[] args) {
        int temperature; // You can change this value to test different scenarios
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current temperature in degrees Celsius: ");
        temperature = input.nextInt();

        if (temperature <= 10 && temperature >= -50) {
            System.out.println("It is cold outside.");
            System.out.println("Wear warm clothes!");
        } else if (temperature >= 25 && temperature <= 60) {
            System.out.println("It is hot outside.");
            System.out.println("Stay hydrated!");
        } else if (temperature > 10 && temperature < 25) {
            System.out.println("It is mild outside.");
            System.out.println("Enjoy your day!");
        }
        else {
            System.out.println("Temperature out of expected range.");
        }
    }
}