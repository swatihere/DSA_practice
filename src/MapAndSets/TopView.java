package MapAndSets;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
    //node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Pair{
        Node node;
        int hd;  //Store horizontal Distance

        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void TopView(Node root){
        if(root == null) return;  //if tree is empty

        HashMap<Integer, Integer> map = new HashMap<>();    // HashMap stores horizontal distance and node value
        Queue<Pair> q = new LinkedList<>();               // Queue stores node and its horizontal distance

        q.add(new Pair(root, 0));

        while(!q.isEmpty()){   //continue until queue becomes empty
            Pair current = q.remove();
            Node node = current.node;
            int hd = current.hd;   // Get horizontal distance

            if(!map.containsKey(hd)){      // If this horizontal distance is seen for the first time
                map.put(hd, current.hd);   // Store the node in HashMap
            }

            if(node.left != null){
                q.add(new Pair(node.left, hd-1));
            }
            if(node.right != null){
                q.add(new Pair(node.right, hd+1));
            }
        }

        //Print the top view
        for(int value :  map.values()){
            System.out.print(value + " ");
        }
    }
    public static void main(String[] args) {

        // Create the tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Call topView function
        TopView(root);
    }

}
