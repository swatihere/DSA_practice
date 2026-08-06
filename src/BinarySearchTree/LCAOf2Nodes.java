package BinarySearchTree;

public class LCAOf2Nodes {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node lca(Node root, int p, int q){
        if(root == null){
            return null;
        }
        // Both values are smaller
        if (p < root.val && q < root.val) {
            return lca(root.left, p, q);
        }

        // Both values are greater
        if (p > root.val && q > root.val) {
            return lca(root.right, p, q);
        }

        // Current node is LCA
        return root;
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

        Node ans = lca(root, 20, 40);

        System.out.println("LCA = " + ans.val);
    }
}
