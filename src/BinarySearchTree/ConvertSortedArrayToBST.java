package BinarySearchTree;

public class ConvertSortedArrayToBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // Convert sorted array into BST
    public static Node sortedArrayToBST(int[] arr, int start, int end) {

        // Base Case
        if (start > end) {
            return null;
        }

        // Find middle element
        int mid = (start + end) / 2;

        // Middle element becomes root
        Node root = new Node(arr[mid]);

        // Build left subtree
        root.left = sortedArrayToBST(arr, start, mid - 1);

        // Build right subtree
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Node root = sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}
