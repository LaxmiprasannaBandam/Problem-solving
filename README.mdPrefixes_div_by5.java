import java.util.*;

public class Solution {

    /**
     * Returns a list of booleans where each element indicates
     * whether the binary number formed by the prefix nums[0..i] is divisible by 5.
     *
     * @param nums Input binary array (0s and 1s)
     * @return List<Boolean> indicating divisibility by 5
     */
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer = new ArrayList<>();
        int x = 0; // Current number modulo 5

        for (int b : nums) {
            // Build the binary number prefix modulo 5
            x = (x * 2 + b) % 5;
            answer.add(x == 0); // true if divisible by 5
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {0, 1, 1};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + sol.prefixesDivBy5(nums1));
        // Expected: [true, false, false]

        // Example 2
        int[] nums2 = {1, 1, 1};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Output: " + sol.prefixesDivBy5(nums2));
        // Expected: [false, false, false]

        // Example 3
        int[] nums3 = {1, 0, 1, 0, 1};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.println("Output: " + sol.prefixesDivBy5(nums3));
        // Expected: [false, false, false, false, true]
    }
}
