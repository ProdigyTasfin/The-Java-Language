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
// input.next();

System.out.println("What is your favorite subject?");
String subject = input.next();
System.out.println(name + ", your fav's subject is " + subject);

System.out.println("Tell me! your height in centimeters?");
double height = input.nextDouble();
System.out.print(name + ", your height is " + height + " cm.\n");

// input.nextLine(); // Consume the leftover newline

System.out.println("Tell me! your fav movie");
String movie = input.next();
System.out.println(name + ", your fav movie is " + movie);




}
}