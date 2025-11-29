public class Solution {

    public char findTheDifference(String s, String t) {
        int xor = 0;

        // XOR all characters from s
        for (char c : s.toCharArray()) {
            xor ^= c;
        }

        // XOR all characters from t
        for (char c : t.toCharArray()) {
            xor ^= c;
        }

        // The remaining xor value is the extra character
        return (char) xor;
    }

    // Test the function
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "abcd";
        String t = "abcde";

        char result = sol.findTheDifference(s, t);
        System.out.println("The extra character is: " + result);
    }
}
