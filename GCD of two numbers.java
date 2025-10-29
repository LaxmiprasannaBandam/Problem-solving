import java.util.Scanner;

class Solution {

    // Static method to find GCD using recursion
    public static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return GCD(n2, n1 % n2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        scanner.close();
        int result = GCD(num1, num2);

        // Output result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
