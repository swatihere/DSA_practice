package BinaryTree;

import java.util.ArrayList;

public class RootToLeafPath {
    public static ArrayList <ArrayList<Integer>> path(Node root){  // Create an ArrayList to store all root-to-leaf paths
        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();    // Final answer: stores all paths from root to leaf
        dfs(root , new ArrayList<>() , ans);
        return ans;
    }

    private static void dfs(Node root,
                            ArrayList<Integer> arr,
                            ArrayList<ArrayList<Integer>> ans) {

        // Base case
        if (root == null) {
            return;
        }

        // Add current node to the current path
        arr.add(root.val);

        // If current node is a leaf node
        if (root.left == null && root.right == null) {

            // Store a copy of the current path
            ans.add(new ArrayList<>(arr));

            // Remove current node before returning (Backtracking)
            arr.remove(arr.size() - 1);

            return;
        }

        // Traverse left subtree
        dfs(root.left, arr, ans);

        // Traverse right subtree
        dfs(root.right, arr, ans);

        // Remove current node before going back (Backtracking)
        arr.remove(arr.size() - 1);
    }
    public static void main(String[] args) {

        //        1
        //      /   \
        //     2     3
        //    / \     \
        //   4   5     6

        // Create nodes
        Node a = new Node(1);   // Root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        // Attach nodes
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;

        // Get all root-to-leaf paths
        ArrayList<ArrayList<Integer>> ans = path(a);

        // Print all paths
        System.out.println("Root to Leaf Paths:");

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
