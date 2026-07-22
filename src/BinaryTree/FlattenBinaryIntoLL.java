package BinaryTree;

public class FlattenBinaryIntoLL {
    public static void flatten(Node root) {
        //Base case
        if (root == null) {
            return;
        }
        //Flatten left subtree
        flatten(root.left);
        //Flatten right subtree
        flatten(root.right);

        // If left subtree exists
        if(root.left!= null){
            Node temp = root.right;   // Store the original right subtree
            root.right = root.left;  // Move left subtree to right
            root.left = null;

            Node curr = root.right;   // Go to the last node of new right subtree

            while (curr.right != null) {
                curr = curr.right;
            }
            // Attach the old right subtree
            curr.right = temp;
        }
    }
    // Print flattened linked list
    public static void display(Node root) {

        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }

        System.out.println();
    }
    public static void main(String[] args) {

        //        1
        //      /   \
        //     2     5
        //    / \     \
        //   3   4     6

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(6);

        // Attach nodes
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;

        // Flatten the tree
        flatten(a);

        // Print linked list
        display(a);
    }
}

