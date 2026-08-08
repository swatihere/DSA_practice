package BinarySearchTree;

public class InorderPredecessorAndSuccessor {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    static class Pair {
        Node pred;
        Node succ;

        Pair(Node pred, Node succ) {
            this.pred = pred;
            this.succ = succ;
        }
    }
    public static Pair findpredecessorSuccessor(Node root , int key){
        Node curr =  root;  // Find the node whose value is equal to key

        while(curr != null && curr.val != key){
            // If key is smaller, go left
            if (key < curr.val) {
                curr = curr.left;
            }

            // If key is greater, go right
            else {
                curr = curr.right;
            }
        }
        // If key is not present
        if (curr == null) {
            return new Pair(null, null);
        }
        //PREDECESSOR
        Node pred = null;

        // Predecessor is present in the left subtree
        if (curr.left != null) {

            // First go to the left
            pred = curr.left;

            // Then go as far right as possible
            while (pred.right != null) {
                pred = pred.right;
            }
        }
        //SUCCESSOR

        Node succ = null;

        // Successor is present in the right subtree
        if (curr.right != null) {

            // First go to the right
            succ = curr.right;

            // Then go as far left as possible
            while (succ.left != null) {
                succ = succ.left;
            }
        }

        // Return both predecessor and successor
        return new Pair(pred, succ);
    }
}
