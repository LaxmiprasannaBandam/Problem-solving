import java.util.Scanner;

public class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        boolean result = sol.isPowerOfFour(n);
        System.out.println(n + " is power of 4? " + result);

        scanner.close();
    }
}
