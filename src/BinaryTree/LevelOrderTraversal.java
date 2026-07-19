package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void levelOrderTraversal(Node root){            //LEVEL ORDER TRAVERSAL
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);   //add root into queue

        while(q.size()>0){        // Run until queue becomes empty

            Node front = q.remove();     // Remove the front node
            System.out.print(front.val+" ");    //print

            if(front.left!=null){    //now add left child
                q.add(front.left);
            }
            if(front.right!=null){   //then add right child
                q.add(front.right);
            }
        }
        System.out.println();
    }

    public static void levelOrderLineWise(Node root){             //LINE WISE ORDER
       Queue<Pair> q = new LinkedList<>();
       int currLevel = 0;
       q.add(new Pair(root,0));   // Add root with level 0

       while(q.size()>0){
           Pair front = q.remove();

           if(front.level != currLevel){     // If level changes, print a new line
               currLevel++;
               System.out.println();
           }
           System.out.print(front.node.val+" ");  //print

           if(front.node.left!=null){              // Add left child with next level
               q.add(new Pair(front.node.left,front.level+1));
           }
           if(front.node.right!=null){             // Add right child with next level
               q.add(new Pair(front.node.right,front.level+1));
           }
       }
       System.out.println();
    }

    public static void KthLevel(Node root, int level , int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.val+" ");
        }
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);
    }

    public static void main(String[] args) {

        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7

        // Create nodes
        Node a = new Node(1);   // Root
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

        // Call level order traversal
        System.out.print("Level Order Traversal : ");
        levelOrderTraversal(a);

        System.out.println("Levl order LineWise : ");
        levelOrderLineWise(a);

        System.out.println("Kth Level order : ");
        KthLevel(a,0,2);
    }

}
