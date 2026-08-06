package BinarySearchTree;

public class CheckForBST {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static boolean isBST(Node root , int min , int max){
        //base case
        if(root == null){
            return false;
        }
        //check left and right subtree
        if(root.val <= min || root.val >= max ){
            return false;
        }
        // Check left and right subtree
        return isBST(root.left, min, root.val )&& isBST(root.right, root.val , max);
    }
    public static void main(String[] args) {

        // Creating the tree
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            System.out.println("Tree is a BST");
        } else {
            System.out.println("Tree is not a BST");
        }
    }
}
