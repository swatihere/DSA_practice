package BinarySearchTree;

import java.util.ArrayList;

public class KthSmallestInBst {
   static class Node{
       int val;
       Node left;
       Node right;

       Node(int val){
           this.val = val;
       }
   }
   //Inorder Traversal
    public static void inorder(Node root , ArrayList<Integer> list){
       if(root == null){
           return;
       }
       inorder(root.left,list);
       list.add(root.val);
       inorder(root.right,list);
    }
    public static int kthSmallest(Node root, int k){
        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list.get(k - 1);
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

        int k = 3;

        System.out.println("Kth Smallest = " + kthSmallest(root, k));
    }
}
