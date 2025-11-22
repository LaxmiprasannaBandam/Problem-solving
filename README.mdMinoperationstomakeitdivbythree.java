
public class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                operations++;
            }
        }

        return operations;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 6, 9};

        System.out.println(sol.minimumOperations(nums1)); 
        System.out.println(sol.minimumOperations(nums2)); 
    }
}
