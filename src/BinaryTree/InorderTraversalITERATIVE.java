package BinaryTree;

import java.util.Stack;

public class InorderTraversalITERATIVE {
    public static void inOrder(Node root){

        Stack<Node> st = new Stack<>();
        Node curr = root;   // Current node starts from root

        // Continue until stack is empty and current becomes null
        while(curr != null || st.size()>0){
            // Go to the leftmost node
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();  //remove the top node

            System.out.println(curr.val+" ");

            curr = curr.right;  //move to the right subtree
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        // Attach nodes
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        // Print inorder traversal
        inOrder(a);
    }
}
