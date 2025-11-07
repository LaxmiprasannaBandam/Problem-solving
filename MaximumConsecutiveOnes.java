import java.util.Scanner;

public class Main {
    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int currentCount = 0;
            int maxCount = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    currentCount++;
                } else {
                    maxCount = Math.max(maxCount, currentCount);
                    currentCount = 0;
                }
            }
            return Math.max(maxCount, currentCount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements (0s and 1s only): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sol.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);

        sc.close();
    }
}
