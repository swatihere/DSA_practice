package BinaryTree;

import java.util.Stack;

public class PreOrderTraversalITERATIVE {
    public static void preOrder(Node root) {
        // If tree is empty
        if (root == null) {
            return;
        }
        Stack<Node> st = new Stack<>();  //create a stack

        // Push root
        st.push(root);
        while(st.size() >0){      // Traverse until stack becomes empty
            Node curr =  st.pop();  // Remove top node

            // Print current node
            System.out.print(curr.val + " ");

            // Push right child first
            if (curr.right != null) {
                st.push(curr.right);
            }

            // Push left child second
            if (curr.left != null) {
                st.push(curr.left);
            }
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

        // Print preorder traversal
        preOrder(a);
    }
}
