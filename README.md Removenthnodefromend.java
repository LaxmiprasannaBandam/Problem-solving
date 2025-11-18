public class RemoveNthNode {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            // Dummy node to handle edge cases
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode fast = dummy;
            ListNode slow = dummy;

            // Move fast pointer n+1 steps ahead
            for (int i = 0; i <= n; i++) {
                fast = fast.next;
            }

            // Move both pointers until fast hits the end
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            // Remove the nth node
            slow.next = slow.next.next;

            return dummy.next;
        }
    }

    // Utility to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Utility to create a linked list from an array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example: [1, 2, 3, 4, 5], n = 2 → Output: 1 2 3 5
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = createList(arr);

        System.out.println("Original List:");
        printList(head);

        head = sol.removeNthFromEnd(head, 2);

        System.out.println("After Removing 2nd Node From End:");
        printList(head);
    }
}
