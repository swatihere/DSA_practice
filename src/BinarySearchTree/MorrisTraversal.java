package BinarySearchTree;

import java.util.ArrayList;

public class MorrisTraversal {  //for inorder of BST by linking and unlinking
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static ArrayList<Integer> morrisInorder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        Node curr = root;  //place curr value to the root
        while(curr != null){
            if(curr.left != null){   // If left child exists
                Node pred = curr.left;   // Find inorder predecessor

                while(pred.right != null && pred.right != curr){   // Go to the rightmost node of the left subtree
                    pred = pred.right;
                }
                //LINKING
                if(pred.right == null){
                    pred.right = curr;   // Create temporary link from pred to curr node
                    curr = curr.left;     // Move to left subtree
                }
                //UNLINKING
                else{   //pred.right == curr
                    pred.right = null;   // Remove the temporary link
                    ans.add(curr.val);
                    curr = curr.left;
                }
            }
            else{    // If there is no left child
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        // Creating the tree
        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        // Get Morris inorder traversal
        ArrayList<Integer> ans = morrisInorder(root);

        // Print the ArrayList
        System.out.println(ans);
    }
}
