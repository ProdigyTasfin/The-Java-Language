import java.util.Scanner;

public class Array_Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        // Bubble sort 
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int x : arr)
            System.out.print(x + " ");

        input.close();
    }
}