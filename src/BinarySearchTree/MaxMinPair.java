package BinarySearchTree;

public class MaxMinPair {
    static class Node {
        int val ;
        Node left ;
        Node right ;
        Node(int val) {
            this.val = val;
        }
    }
    //Pair class
    static class Pair{
        int min;
        int max;
        Pair(int min,int max){
            this.min = min;
            this.max = max;
        }
    }
    public static Pair findMaxMin(Node root){
        //Leaf Node
        if(root.left == null && root.right == null){
            return new Pair(root.val,root.val);
        }
        int min = root.val;  // Initially, consider the current node's value as both min and max
        int max = root.val;

        // Find min and max from left side
        if(root.left != null){
            Pair left = findMaxMin(root.left);
            min = Math.min(min, left.min);
            max = Math.max(max, left.max);
        }
        // Find min and max from right subtree
        if(root.right != null){
            Pair right = findMaxMin(root.right);
            min = Math.min(min, right.min);
            max = Math.max(max, right.max);
        }
        return new Pair(min, max);
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

        // Find min and max
        Pair ans = findMaxMin(root);

        System.out.println("Minimum = " + ans.min);
        System.out.println("Maximum = " + ans.max);
    }
}
