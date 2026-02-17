import java.util.Scanner;

public class Array_Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] count = new int[101]; // index 1–100 used

        System.out.println("Enter numbers (0 to stop):");

        for (;;) {

            int num = input.nextInt();

            if (num == 0)
                break;

            if (num >= 1 && num <= 100)
                count[num]++;
        }

        for (int i = 1; i <= 100; i++) {
            if (count[i] > 0)
                System.out.println(i + " occurs " + count[i] + " times");
        }

        input.close();
    }
}
