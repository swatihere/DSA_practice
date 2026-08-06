package BinaryTree;

import java.util.ArrayList;

public class TreeBoundaryTraversal {
    static ArrayList<Integer> ans = new ArrayList<>();
    public static ArrayList<Integer> BoundaryTraversal(Node root) {

        if(root == null) return ans;

        ans.add(root.val);  // Step 1: Add the root first

        //Left boundary
        leftBoundary(root.left);  // Step 2: Add all left boundary nodes (except leaf nodes)

        //Leaf Node
        leafNodes(root.left);    // Step 3: Add all leaf nodes from left subtree
        leafNodes(root.right);   // Step 4: Add all leaf nodes from right subtree

        //Right Boundary
        rightBoundary(root.right);  // Step 5: Add right boundary nodes in reverse order

        return ans;
    }
    //left boundary
    public static void leftBoundary(Node root){
        if(root == null) return;


        // If it is a leaf node, don't add it here.
        // Leaf nodes will be added in leafNodes().
        if(root.left == null && root.right == null)
            return;

        ans.add(root.val); // Add current boundary node

        if(root.left != null)    // Prefer moving left
            leftBoundary(root.left);
        else
            leftBoundary(root.right);   // If left child doesn't exist, move right
    }
    //Leaf nodes
    public static void leafNodes(Node root){
        if(root == null) return;

        if(root.left == null && root.right == null){
            ans.add(root.val);
            return;
        }
        leafNodes(root.left);
        leafNodes(root.right);
    }
    //Right Boundary
    public static void rightBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            return;
        }
        if(root.left != null)
            rightBoundary(root.right);
        else {
            rightBoundary(root.left);
        }
        ans.add(root.val);
    }
}
