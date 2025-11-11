public class Main {
    public static void main(String[] args) {
        int[] nums = {-10, -10, 5, 2};
        System.out.println("Maximum product: " + maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
      
        int max1 = nums[0], max2 = nums[1], max3 = nums[2];
        int min1 = nums[0], min2 = nums[1];

        
        if (max1 < max2) { int temp = max1; max1 = max2; max2 = temp; }
        if (max1 < max3) { int temp = max1; max1 = max3; max3 = temp; }
        if (max2 < max3) { int temp = max2; max2 = max3; max3 = temp; }

       
        if (min1 > min2) { int temp = min1; min1 = min2; min2 = temp; }

        
        for (int i = 3; i < nums.length; i++) {
            int num = nums[i];
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

  
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
