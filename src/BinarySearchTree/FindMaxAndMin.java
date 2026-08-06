package BinarySearchTree;
import org.w3c.dom.Node;

public class FindMaxAndMin {
    // Node class
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }
    public static int findMin(Node root) {
        //Empty tree
        if (root == null) {
            return -1;
        }
        //move to the leftmost node
        while(root.left != null){
            root = root.left;
        }
        return root.val;
    }
    // Find Maximum
    public static int findMax(Node root) {

        // Tree is empty
        if (root == null) {
            return -1;
        }

        // Move to the rightmost node
        while (root.right != null) {
            root = root.right;
        }

        return root.val;
    }
    public static void main(String[] args) {

        // Creating the BST
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root.left.left.left = new Node(10);

        System.out.println("Minimum Element = " + findMin(root));
        System.out.println("Maximum Element = " + findMax(root));
    }
}
