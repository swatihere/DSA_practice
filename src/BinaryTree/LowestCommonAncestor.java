package BinaryTree;

public class LowestCommonAncestor {
    public static Node lca(Node root , Node p , Node q ){
        //if tree is empty
        if(root == null){
            return null;
        }
        //if current node is p or q
        if(root == p || root == q){
            return root;
        }

        //search in left
        Node left = lca(root.left, p, q);

        //search in right
        Node right = lca(root.right, p, q);

        // If both sides return a node,
        // current node is the LCA
        if(left != null && right != null){
            return root;
        }

        // If left subtree contains any node, return it
        if (left != null) {
            return left;
        }

        return right;
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

        // Find LCA of 4 and 5
        Node ans = lca(a, d, e);

        System.out.println("LCA = " + ans.val);
    }

}
