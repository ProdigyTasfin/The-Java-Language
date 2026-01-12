// Exception handling = an event occurs during the execution of a program that,
//                      distrups the normal flow of instructions. 

import java.util.Scanner;

public class OOP_18 {

    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.print("Enter y: ");
        int y = input.nextInt();

        int z = x/y;
        System.out.println("Result (x/y): " +z);


    }
}