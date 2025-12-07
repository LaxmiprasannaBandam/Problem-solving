import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        System.out.print("Enter low: ");
        int low = scanner.nextInt();

        System.out.print("Enter high: ");
        int high = scanner.nextInt();

        // Calculate number of odd numbers
        int count = countOdds(low, high);

        // Output result
        System.out.println("Number of odd numbers between " + low + " and " + high + ": " + count);

        scanner.close();
    }

    // Method to count odd numbers in the range
    public static int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
}
