//103 studs and 4 are each group, so how many full groups can be made?

import java.util.Scanner;

public class math_floor {
    public static void main(String[] args){
    
    double x,y;
    System.out.print("Number of groups: ");
    Scanner input = new Scanner(System.in);
    x = input.nextDouble();
    System.out.print("Number of students: ");
    y = input.nextDouble();
    double z = (int) Math.floor(y/x);
    System.out.print("Number of full groups: "+z);
    }
    
}  
