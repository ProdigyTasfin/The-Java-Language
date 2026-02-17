import java.util.Scanner;

public class Array_Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter number of students: ");
        n = input.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks: ");
            marks[i] = input.nextInt();
        }

        int best = marks[0];
        for (int i = 0; i < n; i++) {
            if (marks[i] > best) {
                best = marks[i];
            }
        }
        for (int i = 0; i < n; i++) {

            char grade;

            if (marks[i] >= best - 10) {
                grade = 'A';
            } else if (marks[i] >= best - 20) {
                grade = 'B';
            } else if (marks[i] >= best - 30) {
                grade = 'C';
            } else if (marks[i] >= best - 40) {
                grade = 'D';
            } else
                grade = 'F';

            System.out.println("Student " + (i+1) + " score is " + marks[i] + " and grade is " + grade);

        }
        input.close();
    }
}