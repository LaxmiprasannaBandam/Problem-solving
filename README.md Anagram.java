/**
 * LeetCode 242 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * This program checks whether two strings are anagrams of each other.
 * It includes:
 *  - A Solution class containing the actual method
 *  - A Main class with sample tests
 */

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.isAnagram("anagram", "nagaram")); // true
        System.out.println(solution.isAnagram("rat", "car"));         // false
        System.out.println(solution.isAnagram("aacc", "ccac"));       // false
    }
}

class Solution {

    /**
     * Returns true if string t is an anagram of string s.
     */
    public boolean isAnagram(String s, String t) {
        // If strings differ in length -> can't be anagrams
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        // Count characters in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Subtract counts based on t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        // If all counts return to zero -> anagram
        for (int val : count) {
            if (val != 0) return false;
        }

        return true;
    }
}
