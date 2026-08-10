package BinarySearchTree;
public class FlattenBSTtoLinkedList {  //with the help of Morris Traversal (modified)
    static class Node {
        int val;
        Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }
    public static Node flatten(Node root) {
        Node curr = root ; //current Node

        while (curr != null) {

            if (curr.left != null) {
                Node pred = curr.left;   // Find inorder predecessor, Predecessor = rightmost node of left subtree

                while (pred.right != null) {    // Go to the rightmost node to the leftmost tree
                    pred = pred.right;
                }
                pred.right = curr.right;  // Connect predecessor to current right subtree
                curr.right = curr.left;   // Move left subtree to the right
                curr.left = null;         // Remove left connection
                curr = curr.right;        // Move to the new right subtree
            }
            else {
                curr = curr.right;
            }
        }
        return root;  // Return the root of flattened tree
    }
    // Print the flattened tree
    public static void printList(Node root) {

        while (root != null) {

            System.out.print(root.val + " ");

            // Move to next node using right pointer
            root = root.right;
        }
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

        // Flatten BST
        Node head = flatten(root);

        // Print linked list
        printList(head);
    }


}
