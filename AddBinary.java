import java.util.Scanner;

public class Solution {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    // Main function with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter first binary number (a): ");
        String a = sc.nextLine();

        System.out.print("Enter second binary number (b): ");
        String b = sc.nextLine();

        String result = sol.addBinary(a, b);

        System.out.println("Binary Sum = " + result);

        sc.close();
    }
}
