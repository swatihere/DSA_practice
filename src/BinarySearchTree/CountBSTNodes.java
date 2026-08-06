package BinarySearchTree;

public class CountBSTNodes {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }
    public static int countNodes(Node root, int low , int high) {

        //Base case
        if(root == null) return 0;

        // Current node lies in the range
        if (root.val >= low && root.val <= high) {
            return 1 + countNodes(root.left, low, high) + countNodes(root.right, low, high);
        }

        // Current value is smaller than low
        // Search only in right subtree
        if (root.val < low) {
            return countNodes(root.right, low, high);
        }

        // Current value is greater than high
        // Search only in left subtree
        return countNodes(root.left, low, high);
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

        int low = 30;
        int high = 70;

        int count = countNodes(root, low, high);

        System.out.println("Count of nodes = " + count);
    }
}
