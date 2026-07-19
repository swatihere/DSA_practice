package BinaryTree;

public class IdenticalTree {
    public static boolean identical(Node root1, Node root2) {

        // If both trees are empty
        if (root1 == null && root2 == null) {
            return true;
        }

        // If one tree is empty and the other is not
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check current node value
        if (root1.val != root2.val) {
            return false;
        }

        // Check left subtree and right subtree
        return identical(root1.left, root2.left)
                && identical(root1.right, root2.right);
    }
    public static void main(String[] args) {

        // Tree 1
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.left = b;
        a.right = c;

        // Tree 2
        Node x = new Node(1);
        Node y = new Node(2);
        Node z = new Node(3);

        x.left = y;
        x.right = z;

        System.out.println(identical(a, x));
    }
}
