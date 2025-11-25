import java.util.Scanner;

public class SmallestRepunitDivisible {
    public static int smallestRepunitDivByK(int k) {
        int remainder = 0;
        for (int length = 1; length <= k; length++) {
            remainder = (remainder * 10 + 1) % k; 
            if (remainder == 0) {
                return length; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer k: ");
        int k = scanner.nextInt();

        if (k <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int length = smallestRepunitDivByK(k);
            if (length == -1) {
                System.out.println("No number consisting only of 1s is divisible by " + k);
            } else {
                System.out.println("The length of the smallest number consisting only of 1s divisible by " + k + " is " + length);
            }
        }

        scanner.close();
    }
}
