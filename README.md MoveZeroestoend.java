import java.util.Scanner;

public class MoveZeroes {
    
    // Method to move zeroes to the end
    public static void moveZeroes(int[] nums) {
        int writeIndex = 0;
        
        // Move all non-zero elements to the front
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        
        // Fill the remaining positions with zeros
        while (writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }

    // Main function to take input and print output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Step 2: Get array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 3: Call the moveZeroes method
        moveZeroes(nums);

        // Step 4: Print the result
        System.out.println("Array after moving zeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
