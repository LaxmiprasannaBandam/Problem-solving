import java.util.Scanner;

public class Solution {    
    public static String largeOddNum(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 != 0) {
                // Remove leading zeros
                int start = 0;
                while (start < i + 1 && s.charAt(start) == '0') {
                    start++;
                }
                return s.substring(start, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String s = sc.nextLine();
        String result = largeOddNum(s);
        System.out.println("Largest odd number: " + result);
        sc.close();
    }
}
