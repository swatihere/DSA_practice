package BinarySearchTree;

public class DeleteNode0Child {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node delete(Node root , int key){
        //if tree is empty
        if (root == null){
            return null;
        }
        //Search in Left subtree
        if(key < root.val){
            root.left = delete(root.left, key);
        }
        //Search in Right Subtree
        else if (key > root.val){
            root.right = delete(root.right, key);
        }
        //Node found
        else{
            //Node has 0 child
            if (root.left == null && root.right == null){
                return null;
            }
        }
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

        // Creating BST
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println("Before deletion:");
        inorder(root);

        // Delete leaf node
        root = delete(root, 20);

        System.out.println("\nAfter deletion:");
        inorder(root);
    }
}
