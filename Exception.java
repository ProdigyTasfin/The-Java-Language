// Exception handling = an event occurs during the execution of a program that,
//                      distrups the normal flow of instructions. 

import java.util.Scanner;
import java.util.InputMismatchException; 
import java.util.Exception;

public class Exception_Handling {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        try {

            System.out.print("Enter x: ");
            int x = input.nextInt();

            System.out.print("Enter y: ");
            int y = input.nextInt();

            int z = x / y;
            System.out.println("Result (x/y): " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by ZERO");
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a Number");
        }
        catch (Exception e) {
            System.out.println("Something went WRONG!!");
        }

        finally{
            input.close();
        }

    }
}