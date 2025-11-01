public class MergeSortedArrays {
    public static void main(String[] args) {
        // Example arrays:
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 with extra space at the end
        int[] nums2 = {2, 5, 6}; // nums2

        int m = 3; // number of valid elements in nums1
        int n = 3; // number of elements in nums2

        // Call the merge function
        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;          // Pointer for the last valid element in nums1
        int p2 = n - 1;          // Pointer for the last element in nums2
        int last = m + n - 1;    // Pointer for the last position in nums1

        // Merge from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[last] = nums1[p1];
                p1--;
            } else {
                nums1[last] = nums2[p2];
                p2--;
            }
            last--;
        }

        // If any elements remain in nums2, copy them
        while (p2 >= 0) {
            nums1[last] = nums2[p2];
            p2--;
            last--;
        }
    }
}
