package BinarySearchTree;

public class LargestBST {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    static class Pair{
        int min;
        int max;
        int size;
        boolean isBST;
        Pair(int min , int max , int size , boolean isBST) {
            this.min = min;
            this.max = max;
            this.size = size;
            this.isBST = isBST;
        }
    }
    static int largest = 0 ;
    public static Pair largestBST(Node root){
        // Empty tree
        if(root == null){
            return new Pair(
                    Integer.MAX_VALUE,  // min
                    Integer.MIN_VALUE,  // max
                    0,                  // size
                    true                // empty tree is BST
            );
        }
        Pair left = largestBST(root.left); //info about the left tree
        Pair right = largestBST(root.right); //info about the right tree

        if (left.isBST &&
                right.isBST &&
                root.val > left.max &&
                root.val < right.min){
            int size = left.size + right.size + 1;  // Current subtree is a BST
            int min = Math.min(root.val , left.min);  //find the smallest value
            int max = Math.max(root.val , right.max); //find the largest value

            largest = Math.max(largest, size);  //compare curr BSt with the largest BsT found so far

            return new Pair(min, max, size, true);
        }
        return new Pair(   //if the above cond ids false then subtree is not BST
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                0,
                false
        );
    }
    public static void main(String[] args) {

        // Creating a Binary Tree
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(60);

        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right.left = new Node(45);
        root.right.right = new Node(70);

        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        // Find the largest BST
        largestBST(root);

        // Print the size of largest BST
        System.out.println("Largest BST size = " + largest);
    }
}
