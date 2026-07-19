package BinaryTree;

public class PathSum {
    public static boolean pathSum(Node root, int target) {

        // If tree is empty
        if (root == null) {
            return false;
        }
        // If current node is a leaf node
        if (root.left == null && root.right == null) {

            // Check if target equals leaf value
            return target == root.val;
        }
        // Remaining sum after visiting current node
        int remaining = target - root.val;

        // Check left subtree OR right subtree
        return pathSum(root.left, remaining)
                || pathSum(root.right, remaining);
    }
    public static void main(String[] args) {

        //        5
        //      /   \
        //     4     8
        //    /     / \
        //   11    13  4
        //  /  \         \
        // 7    2         1

        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(8);
        Node d = new Node(11);
        Node e = new Node(13);
        Node f = new Node(4);
        Node g = new Node(7);
        Node h = new Node(2);
        Node i = new Node(1);

        a.left = b;
        a.right = c;

        b.left = d;

        c.left = e;
        c.right = f;

        d.left = g;
        d.right = h;

        f.right = i;

        int target = 22;

        System.out.println(pathSum(a, target));
    }
}
