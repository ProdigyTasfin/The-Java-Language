// There is 12 pigeons and 11 pigeonholes.
// Prove that at least one pigeonhole must contain more than one pigeon.
// user-based solution using the pigeonhole principle.

import java.util.Scanner;

public class math_pigeonhole_Problem {

    public static void main(String[] args){
    
    double x,y;
    System.out.print("Number of holes: ");
    Scanner input = new Scanner(System.in);
    x = input.nextDouble();
    System.out.print("Number of pigeons: ");
    y = input.nextDouble();
    double z = Math.ceil(y/x);
    System.out.print("Number of pigeonholes: "+z);
    }
    
}
