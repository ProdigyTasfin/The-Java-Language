import java.util.Scanner;

public class Array_Q3 {

    public static int maxIndex(int[] arr) {
        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int minIndex(int[] arr) {
        int min = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int maxI = maxIndex(arr);
        int minI = minIndex(arr);

        System.out.println("Highest Value: " + arr[maxI] +
                " at Index: " + maxI);
        System.out.println("Smallest Value: " + arr[minI] +
                " at Index: " + minI);

        input.close();
    }
}
