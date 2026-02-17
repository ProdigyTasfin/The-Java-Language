import java.util.Scanner;
public class Array_Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine();

        String[] names = new String[n];
        int[] scores = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = input.nextLine();

            System.out.print("Enter score: ");
            scores[i] = input.nextInt();
            input.nextLine();
        }

        // Bubble sort (decreasing)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (scores[j] < scores[j + 1]) {

                    // Swap scores
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        System.out.println("Students in decreasing order:");

        for (int i = 0; i < n; i++)
            System.out.println(names[i] + " - " + scores[i]);

        input.close();
    }
}