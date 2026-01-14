
// Write a Java program that prompts the user to input three side lengths(a,b,and,c) of a trinagle
// 1st check if there is any negrative number input or not
// if there is a negative number please  show this message, "Side Lengths of Triangles Can't be Negative"
// 2nd Check is it physically possible or not
// We know that a possible triangle is sum pf any two sides is greater than or equal to the third side
// a+b greater equal c or b+c greater equal a
// 3rd check is it equilateral or not then show it's area and perimeter, formula ((root over 3)*a^2)/4

import java.util.Scanner; 

public class question_02 {

    public static void main(String[] args){

        //Decleration

        int a, b, c;
        Scanner input = new Scanner(System.in);

        //Input 
        System.out.print("Enter your 1st side length: ");
        a = input.nextInt();
        System.out.print("Enter your 2nd side length: ");
        b = input.nextInt();
        System.out.print("Enter your 3rd side length: ");
        c = input.nextInt();

        //Conditions 

        if(a<0 || b<0 || c<0){
            System.out.println("Side Lengths of Triangles Can't be Negative");
        }

        else if(a+b <= c || b+c <= a || c+a <= b){
            System.out.println("Not Possible Way of Creating A Triangle");
        }

        else if (a==b && b==c && a==c) {
            System.out.println("This is an equilateral triangle");
            int parameter = a + b + c;
            double area = (Math.sqrt(3)*Math.pow(a,2))/4;
            System.out.println("Parameter = " + parameter + "\n" +"Area = "+ area);
        }
        else input.close();
    }

}
