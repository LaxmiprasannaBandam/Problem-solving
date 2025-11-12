class Solution {
    public int longestSubarray(int[] nums, int k) {
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                // If sum == k, update max length
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    // For testing
    public static void main(String[] args) {
        Solution s = new Solution();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = s.longestSubarray(nums, k);
        System.out.println("Length of longest subarray with sum = " + k + " is: " + result);
    }
}
