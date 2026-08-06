package BinarySearchTree;

public class InsertaNode {
    //Node class
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    public static Node insert(Node root,int value){
        if(root==null){     // If tree is empty, create a new node
            return new Node(value);
        }
        //go to the left subtree
        if (value < root.val) {
            root.left = insert(root.left, value);
        }
        // Go to right subtree
        else if (value > root.val) {
            root.right = insert(root.right, value);
        }
        // Value already exists
        else {
            System.out.println("Node already exists.");
            return root;
        }

        return root;
    }
    // Inorder Traversal (used to only display the BST)
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
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

        System.out.println("BST Before Insertion:");
        inorder(root);

        int value = 60;   // Change this value to test

        root = insert(root, value);

        System.out.println("\nBST After Insertion:");
        inorder(root);
    }

}
