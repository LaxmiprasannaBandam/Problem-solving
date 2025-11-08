import java.util.Scanner;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long expectedSum = (long) n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers (from 0 to n, one number missing): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = solution.missingNumber(nums);
        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}
