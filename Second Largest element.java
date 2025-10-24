class Solution {
    public int secondLargestElement(int[] nums) {
        int max1 = nums[0];
        int max2 = -1; // start with -1 assuming no second largest found yet
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] < max1 && nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return max2;
    }
}
