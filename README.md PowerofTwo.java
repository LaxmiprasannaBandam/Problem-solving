import java.util.Scanner;

class Solution {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        Solution solution = new Solution();
        boolean result = solution.isPowerOfTwo(n);

        if (result) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is NOT a power of two.");
        }

        sc.close();
    }
}
