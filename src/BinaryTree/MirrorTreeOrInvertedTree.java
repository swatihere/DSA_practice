package BinaryTree;

public class MirrorTreeOrInvertedTree {

    public static void display(Node root){   //By recursion
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);  //recursion
        display(root.right); //recursion
    }

    public static void mirror(Node root) {
        if (root == null) {
            return;           //if tree is empty
        }

        //swap left and right child
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Mirror left subtree
        mirror(root.left);

        // Mirror right subtree
        mirror(root.right);
    }
    public static void main (String[] args){

        //      1
        //    /   \
        //   2     3
        //  / \   / \
        // 4   5 6   7

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

        System.out.print("Before Mirror : ");
        display(a);

        // Convert into mirror tree
        mirror(a);

        System.out.println();

        System.out.print("After Mirror  : ");
        display(a);

    }
}
