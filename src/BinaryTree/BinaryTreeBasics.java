package BinaryTree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

public class BinaryTreeBasics {
    public static void main(String[] args){
        //      1
        //    /   \
        //   2     3
        //  / \   /  \
        // 4   5  6   7
        Node a = new Node(1);  //root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        //attachments
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        display(a);                        //DISPLAY
        System.out.println();

        System.out.println("Size = "+ size(a));                           //SIZE

        System.out.println("Sum of the B-Tree = " + sum(a));              //SUM

        System.out.println("Product of the B-Tree = " + product(a));      //PRODUCT

        System.out.println("Maximum value = " + max(a));                  //MAXIMUM

        System.out.println("Minimum value = " + min(a));                  //MINIMUM

        System.out.println("Level = " + levels(a));

    }
                                  //SIZE
    public static int size(Node root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
                                   //SUM
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }
                                    //PRODUCT
    public static int product(Node root){
        if(root == null){
            return 1;
        }
        return root.val * product(root.left) * product(root.right);
    }
                                  //MAXIMUM
    public static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val , Math.max(max(root.left), max(root.right)) );
    }
                                  //MINIMUM
    public static int min(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val , Math.min(min(root.left), min(root.right)) );
    }
                                  //LEVEL
    public static int levels(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
                                  //DISPLAY
    public static void display(Node root){   //By recursion
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);  //recursion
        display(root.right); //recursion
    }
}
