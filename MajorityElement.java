import java.util.Scanner;

public class Main {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];  
            }
            if (nums[i] == element) {
                count++;           
            } else {
                count--;           
            }
        }

        return element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

    
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int result = majorityElement(nums);

  
        System.out.println("Majority element is: " + result);

        sc.close();
    }
}
