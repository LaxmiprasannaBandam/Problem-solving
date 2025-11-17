/**
 * Dutch National Flag algorithm to sort an array containing only 0s, 1s, and 2s.
 * 
 * The array is sorted in-place in a single pass using three pointers:
 *  - low  : boundary for placing next 0
 *  - mid  : current element under inspection
 *  - high : boundary for placing next 2
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Solution {

    public void sortColors(int[] nums) {

        int low = 0;                 // index where next 0 should go
        int mid = 0;                 // current index to check
        int high = nums.length - 1;  // index where next 2 should go

        // Process elements until mid passes high
        while (mid <= high) {

            // Case 1: current element is 0 → move it to the beginning
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }

            // Case 2: current element is 2 → move it to the end
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
                // Do NOT increment mid here because the swapped element must be checked
            }

            // Case 3: element is 1 → already in correct region
            else {
                mid++;
            }
        }
    }

    /**
     * Simple helper method to swap two elements in the array.
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Optional main method for testing locally
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 0, 1, 2, 1, 0};

        solution.sortColors(nums);

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
