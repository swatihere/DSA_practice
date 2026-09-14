package MapAndSets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BurningTree {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Create parent map
    public static void parentMap(Node root, HashMap<Node, Node> map) {

        // Create queue
        Queue<Node> q = new LinkedList<>();

        // Add root to queue
        q.add(root);

        // Continue until queue becomes empty
        while (!q.isEmpty()) {

            // Remove current node
            Node current = q.poll();

            // If left child exists
            if (current.left != null) {

                // Store left child and its parent
                map.put(current.left, current);

                // Add left child to queue
                q.add(current.left);
            }

            // If right child exists
            if (current.right != null) {

                // Store right child and its parent
                map.put(current.right, current);

                // Add right child to queue
                q.add(current.right);
            }
        }
    }

    // Find the target node
    public static Node find(Node root, int target) {

        // If tree is empty
        if (root == null) {
            return null;
        }

        // If target is found
        if (root.data == target) {
            return root;
        }

        // Search for target in left subtree
        Node left = find(root.left, target);

        // If target is found on left side
        if (left != null) {

            // Return the target node
            return left;
        }

        // If target is not found on left side,
        // search in right subtree
        return find(root.right, target);
    }

    // Burn the tree
    public static int burn(Node root, int target) {

        // HashMap stores parent of every node
        HashMap<Node, Node> map = new HashMap<>();

        // Create parent map
        parentMap(root, map);

        // Find the node where fire starts
        Node start = find(root, target);

        // HashSet stores already burned nodes
        HashSet<Node> set = new HashSet<>();

        // Queue stores nodes which are burning
        Queue<Node> q = new LinkedList<>();

        // Add starting node to queue
        q.add(start);

        // Mark starting node as burned
        set.add(start);

        // Store time taken to burn the tree
        int time = 0;

        // Continue until all nodes are burned
        while (!q.isEmpty()) {

            // Number of nodes burning at current time
            int size = q.size();

            // Process all nodes burning at this time
            for (int i = 0; i < size; i++) {

                // Remove current burning node
                Node current = q.remove();

                // Burn left child
                if (current.left != null &&
                        !set.contains(current.left)) {

                    // Mark left child as burned
                    set.add(current.left);

                    // Add left child to queue
                    q.add(current.left);
                }

                // Burn right child
                if (current.right != null &&
                        !set.contains(current.right)) {

                    // Mark right child as burned
                    set.add(current.right);

                    // Add right child to queue
                    q.add(current.right);
                }

                // Burn parent
                if (map.containsKey(current) &&
                        !set.contains(map.get(current))) {

                    // Get parent node
                    Node parent = map.get(current);

                    // Mark parent as burned
                    set.add(parent);

                    // Add parent to queue
                    q.add(parent);
                }
            }

            // One complete level is finished
            // so one second has passed
            if (!q.isEmpty()) {
                time++;
            }
        }

        // Return total time
        return time;
    }

    public static void main(String[] args) {

        // Create root node
        Node root = new Node(1);

        // Create left and right child
        root.left = new Node(2);
        root.right = new Node(3);

        // Create children of node 2
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Create right child of node 3
        root.right.right = new Node(7);

        // Fire starts from node 5
        int target = 5;

        // Calculate time required to burn tree
        int time = burn(root, target);

        // Print the answer
        System.out.println("Time to burn tree: " + time);
    }
}