import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    // Deserialize a list like: 1 1 2 3 3
    public static ListNode deserialize(String input) {
        if (input.trim().isEmpty()) return null;

        String[] parts = input.trim().split("\\s+");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String p : parts) {
            current.next = new ListNode(Integer.parseInt(p));
            current = current.next;
        }

        return dummy.next;
    }

    // Convert linked list to string
    public static String serialize(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(" ");
            head = head.next;
        }
        return sb.toString();
    }
}

public class Main {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;  // skip duplicate
            } else {
                current = current.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sorted list elements separated by space:");
        String input = sc.nextLine();

        // Build linked list
        ListNode head = ListNode.deserialize(input);

        // Remove duplicates
        head = deleteDuplicates(head);

        // Print final list
        System.out.println("List after removing duplicates:");
        System.out.println(ListNode.serialize(head));

        sc.close();
    }
}
