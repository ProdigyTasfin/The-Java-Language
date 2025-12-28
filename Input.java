import java.util.Scanner;

public class Input {

public static void main(String[] args){

System.out.println("What is your name? ");
Scanner a = new Scanner(System.in);
String name = a.next();
System.out.println("Hello " +name+"!");

System.out.println("How old are you?");
Scanner input = new Scanner(System.in);
double age = input.nextDouble();
System.out.println(name + ", your age is " + age + " years.");

}
}