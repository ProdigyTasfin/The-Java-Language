import java.util.Scanner;

public class switch_Case {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String day = input.next().toLowerCase();   // Convert input to lowercase

        switch(day){
            case "sunday":
                System.out.println("This is Sunday!");
                break;

            case "monday":
                System.out.println("This is Monday!");
                break;

            case "tuesday":
                System.out.println("This is Tuesday!");
                break;

            case "wednesday":
                System.out.println("This is Wednesday!");
                break;

            case "thursday":
                System.out.println("This is Thursday!");
                break;

            case "friday":
                System.out.println("This is Friday!");
                break;

            case "saturday":
                System.out.println("This is Saturday!");
                break;

            default:
                System.out.println("Invalid day!");
        }
    }
}
