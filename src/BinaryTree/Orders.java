package BinaryTree;

public class Orders {
    public static void display(Node root) {   //By recursion
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);  //recursion
        display(root.right); //recursion
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }



    public static void main(String[] args) {
        //      1
        //    /   \
        //   2     3
        //  / \   /  \
        // 4   5  6   7
        Node a = new Node(1);  //root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        //attachments
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        display(a);
        System.out.println();

        preorder(a);
        System.out.println();

        inorder(a);
        System.out.println();

        postorder(a);
        System.out.println();


    }
}