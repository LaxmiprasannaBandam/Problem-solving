import java.util.*;

// Basic TreeNode class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    // ==== Inorder Traversal ====
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inorder(node.left, result);   // Left
        result.add(node.val);         // Node
        inorder(node.right, result);  // Right
    }

    // ==== Build Tree from level-order input ====
    public static TreeNode buildTree(String[] arr) {
        if (arr.length == 0 || arr[0].equalsIgnoreCase("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < arr.length && !arr[i].equalsIgnoreCase("null")) {
                current.left = new TreeNode(Integer.parseInt(arr[i]));
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].equalsIgnoreCase("null")) {
                current.right = new TreeNode(Integer.parseInt(arr[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    // ==== MAIN FUNCTION ====
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tree nodes in level-order (use 'null' for empty):");
        System.out.println("Example: 1 2 3 null 4");

        String input = sc.nextLine().trim();
        String[] arr = input.split("\\s+");

        TreeNode root = buildTree(arr);

        Solution sol = new Solution();
        List<Integer> result = sol.inorderTraversal(root);

        System.out.println("Inorder Traversal:");
        System.out.println(result);
    }
}
