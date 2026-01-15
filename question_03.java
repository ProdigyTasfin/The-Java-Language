// Write a java program using the Scanner class to input the runs of 11 players from the Bangladesh Cricket
// team. 
// Categories: 0-30:very poor
//           : 31-70: average
//           : 71 and above very good

// Output: Print the total number of each category and the maximum run scored in that category

import java.util.Scanner;

public class question_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] run = new int[11];

        int veryPoor = 0;
        int average = 0;
        int veryGood = 0;
        int maxVeryPoor = 0;
        int maxAverage = 0;
        int maxVeryGood = 0;

        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " runs: ");
            run[i] = input.nextInt();

            if (run[i] >= 0 && run[i] <= 30) {
                veryPoor++;
                if (run[i] > maxVeryPoor) {
                    maxVeryPoor = run[i];
                }
            }
            else if (run[i] >= 31 && run[i] <= 70) {
                average++;
                if (run[i] > maxAverage) {
                    maxAverage = run[i];
                }
            }
            else {
                veryGood++;
                if (run[i] > maxVeryGood) {
                    maxVeryGood = run[i];
                }
            }
        }

        System.out.println("\n--- Result ---");
        System.out.println("Very Poor (0 - 30): Count = " + veryPoor + ", Max = " + maxVeryPoor);
        System.out.println("Average (31 - 70): Count = " + average + ", Max = " + maxAverage);
        System.out.println("Very Good (71+): Count = " + veryGood + ", Max = " + maxVeryGood);

        input.close();
    }
}
