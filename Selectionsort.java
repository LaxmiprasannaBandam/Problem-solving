import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of elements
        int n = sc.nextInt();
        int[] a = new int[n];

        // Step 2: Read array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Step 3: Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;  // assume current position is smallest
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j; // update index of smallest element
                }
            }

            // swap the found minimum with the first unsorted element
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        // Step 4: Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
