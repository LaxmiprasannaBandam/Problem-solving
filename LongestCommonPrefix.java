import java.util.Scanner;

public class Solution {

    // Method to find the longest common prefix
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];  // Start with the first string
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] strs = new String[n];
        System.out.println("Enter the strings one by one:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        String result = solution.longestCommonPrefix(strs);
        System.out.println("\nLongest Common Prefix: " + (result.isEmpty() ? "(none)" : result));

        sc.close();
    }
}
