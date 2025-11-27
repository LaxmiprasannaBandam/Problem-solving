import java.util.*;

public class IntersectionOfArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of nums1 elements
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // Match with nums2
        for (int n : nums2) {
            if (map.getOrDefault(n, 0) > 0) {
                result.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    // Utility to print arrays
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);

        System.out.println("Intersection of arrays:");
        printArray(result);

        // Additional example
        int[] a = {4, 9, 5};
        int[] b = {9, 4, 9, 8, 4};
        int[] result2 = intersect(a, b);

        System.out.println("Another example:");
        printArray(result2);
    }
}
