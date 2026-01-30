/*Problem A1 — Exclusive Condition

Write a Java program that:

Takes an integer n

Prints TRUE if n is divisible by exactly one of 4 or 6

Prints FALSE otherwise

Divisible by both → FALSE
Divisible by none → FALSE */ 

import java.util.Scanner;

public class question_06{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n;
        n = input.nextInt();
        if( n % 4 == 0 ^ n % 6 == 0){
            System.out.println("TRUE");}
        else{
            System.out.println("FALSE");
        }

    }
}