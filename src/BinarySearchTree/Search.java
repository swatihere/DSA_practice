package BinarySearchTree;

public class Search {
    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    public static boolean search(Node root, int key) {

        // Traverse until tree ends
        while(root != null) {
            if (root.val == key) {
                return true;
            }
            // Go to left subtree
            else if (key < root.val) {
                root = root.left;
            }

            // Go to right subtree
            else {
                root = root.right;
            }
        }

    // Key not found
    return false;
    }
}
