package BinaryTree;

public class PathFromRootWithASpecificSum {
    public static boolean pathSum(Node root , int sum , int[] path , int index){
        //tree is empty
        if(root == null){
            return false;
        }
        path[index] = root.val;  // Store current node in array

        if(root.left == null && root.right == null){
            if(sum == root.val){     // Check if required sum is found
                for(int i = 0; i <= index; i++){    // Print the path
                    System.out.print(path[i] + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }
        // Search left or right subtree
        return pathSum(root.left, sum - root.val, path, index + 1) ||
                pathSum(root.right, sum - root.val, path, index + 1);
    }
    public static void main(String[] args) {

        //         5
        //       /   \
        //      4     8
        //     /     / \
        //    11    13  4
        //   /  \
        //  7    2

        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(8);
        Node d = new Node(11);
        Node e = new Node(13);
        Node f = new Node(4);
        Node g = new Node(7);
        Node h = new Node(2);

        a.left = b;
        a.right = c;

        b.left = d;

        c.left = e;
        c.right = f;

        d.left = g;
        d.right = h;

        // Maximum path length (can be tree height or number of nodes)
        int[] path = new int[10];

        pathSum(a, 22, path, 0);
    }
}
