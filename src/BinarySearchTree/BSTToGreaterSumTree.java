package BinarySearchTree;

public class BSTToGreaterSumTree {
    static class Node {
        int val ;
        Node left ;
        Node right ;
        Node(int val){
            this.val = val;
        }
    }
    static int sum = 0 ;
    public static void greaterSumTree(Node root){
        if(root == null){
            return;
        }
        //Visit right subtree
        greaterSumTree(root.right);

        // Update sum
        sum = sum + root.val;

        // Replace node value
        root.val = sum;

        // Visit left subtree
        greaterSumTree(root.left);
    }
    // Inorder Traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {

        // Creating BST
        Node root = new Node(4);

        root.left = new Node(1);
        root.right = new Node(6);

        root.left.left = new Node(0);
        root.left.right = new Node(2);

        root.left.right.right = new Node(3);

        root.right.left = new Node(5);
        root.right.right = new Node(7);

        root.right.right.right = new Node(8);

        System.out.println("Before Conversion:");
        inorder(root);

        greaterSumTree(root);

        System.out.println("\nAfter Conversion:");
        inorder(root);
    }
}
