import java.util.Scanner;

public class Solution {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        sol.reverseString(chars);
        System.out.println("Reversed: " + new String(chars));

        scanner.close();
    }
}
