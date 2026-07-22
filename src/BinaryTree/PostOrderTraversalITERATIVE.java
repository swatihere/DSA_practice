package BinaryTree;

import java.util.Stack;

public class PostOrderTraversalITERATIVE {
    public static void postOrder(Node root) {
    if(root == null){
        return;
    }
     Stack<Node> st1 = new Stack<>();
     Stack<Node> st2 = new Stack<>();

     st1.push(root);   // Push root into first stack

        while(st1.size()>0){
            Node curr =  st1.pop();   // remove top root from first stack
            // Push it into stack2
            st2.push(curr);

            // Push left child
            if (curr.left != null) {
                st1.push(curr.left);
            }

            // Push right child
            if (curr.right != null) {
                st1.push(curr.right);
            }
        }
        // Print postorder traversal
        while (st2.size() > 0) {
            System.out.print(st2.pop().val + " ");
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

        // Print postorder traversal
        postOrder(a);
    }
}
