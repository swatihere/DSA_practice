package BinarySearchTree;

public class DeleteNode2Child {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
        public static Node delete(Node root, int key){
            if(key < root.val){
                root.left = delete(root.left, key);
            }
            else if (key > root.val){
                root.right = delete(root.right, key);
            }
            else{
                // use inorder successor/predecessor , if pre then left subtree and if succ then right subtree
                Node successor = root.right;

                while(successor.left != null){   // Then go as far left as possible
                    successor = successor.left;
                }
                root.val = successor.val;  // replace current's value with succ value

                root.right = delete(root.right, successor.val); //remove the original succ
            }
            return root;
        }
    }
}
