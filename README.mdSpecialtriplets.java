import java.util.*;

public class Solution {

    // Required function
    public int specialTriplets(int[] nums) {
        final long MOD = 1_000_000_007L;
        int n = nums.length;

        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        // Fill right map initially
        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0) + 1);
        }

        long ans = 0;

        for (int j = 0; j < n; j++) {
            // current element becomes middle element
            right.put(nums[j], right.get(nums[j]) - 1);
            if (right.get(nums[j]) == 0) right.remove(nums[j]);

            int target = nums[j] * 2;

            int leftCount = left.getOrDefault(target, 0);
            int rightCount = right.getOrDefault(target, 0);

            ans = (ans + (long) leftCount * rightCount) % MOD;

            // move nums[j] to left map
            left.put(nums[j], left.getOrDefault(nums[j], 0) + 1);
        }

        return (int) ans;
    }

    // Main function for GitHub / testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example input
        int[] nums = {4, 2, 4, 2, 1};

        int result = sol.specialTriplets(nums);

        System.out.println("Number of special triplets: " + result);
    }
}
