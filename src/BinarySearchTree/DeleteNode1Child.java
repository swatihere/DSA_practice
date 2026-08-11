package BinarySearchTree;

public class DeleteNode1Child {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static Node delete(Node root , int key){
        if (root == null) return null;     // If tree is empty

        //Search in the left subtree
        if (key < root.val){
            root.left = delete(root.left, key);
        }
        //Search in the right subtree
        else if (key > root.val){
            root.right = delete(root.right, key);
        }
        //Node found
        else{
            //Node has no child
            if (root.left == null && root.right == null){
                return root;
            }
            //Node has only Right Child
            if(root.left == null){
                return root.right;
            }
            //Node has only left Child
            if(root.right == null){
                return root.left;
            }
        }
        return root;
    }
}
