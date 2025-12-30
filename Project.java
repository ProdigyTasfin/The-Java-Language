// Difficulty: Medium/Easy-Peasy 

// Task: A random number will generate, user guess the number, how many guess and show point 

import java.util.Scanner;
import java.util.Random;

public class Project {

    public static void main(String[] args){
        int random_Number = new Random().nextInt(100);
        int user_guess;
        int number_of_guesses;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 0 and 100. Can you guess it?");
        for(number_of_guesses = 0; ; number_of_guesses++){
            System.out.print("Enter your guess: ");
            user_guess = input.nextInt();
            if(user_guess < random_Number){
                System.out.println("Too low! Try again.");
            } else if(user_guess > random_Number){
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + random_Number + " in " + number_of_guesses + " attempts.");
                break;
            }
        }
    }
}