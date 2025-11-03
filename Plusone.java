import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, done
            }
            digits[i] = 0; // Set to 0 and carry over
        }

        // If all digits were 9, need a new array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter the digits (space-separated):");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int[] result = plusOne(digits);

        System.out.println("After increment: " + Arrays.toString(result));

        sc.close();
    }
}
