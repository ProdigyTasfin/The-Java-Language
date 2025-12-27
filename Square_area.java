import java.util.Scanner;

public class Square_area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = input.nextDouble();
        double area = side * side;
        System.out.printf("The area of the square is: %.2f", area);
    }
}