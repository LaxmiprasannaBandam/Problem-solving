import java.util.*;

public class Main {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // empty string is segmentable

        for (int i = 1; i <= n; i++) {
            for (String word : wordSet) {
                int wLen = word.length();
                if (i >= wLen && dp[i - wLen] && s.substring(i - wLen, i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter string s: ");
        String s = sc.nextLine().trim();

        // Input dictionary size
        System.out.print("Enter number of words in dictionary: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input dictionary words
        List<String> wordDict = new ArrayList<>();
        System.out.println("Enter dictionary words:");
        for (int i = 0; i < n; i++) {
            wordDict.add(sc.nextLine().trim());
        }

        // Output result
        boolean result = wordBreak(s, wordDict);
        System.out.println("Output: " + result);
    }
}

