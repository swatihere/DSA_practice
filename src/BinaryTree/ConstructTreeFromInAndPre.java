package BinaryTree;

public class ConstructTreeFromInAndPre {
   public static Node buildTree(int[] inorder, int[] preorder) {
       int n =  inorder.length;
       return build(preorder , inorder , 0 , n-1 , 0 , n-1);
   }
   public static Node build (int[] preorder, int[] inorder,int preStart, int preEnd, int inStart, int inEnd){
       // Base Case
       // No elements left
       if (preStart > preEnd || inStart > inEnd) {
           return null;
       }
       // First element of preorder is the root
       int value = preorder[preStart];
       Node root = new Node(value);

       // Find the root in inorder
       int index = inStart;
       while (inorder[index] != value) {
           index++;
       }

       // Number of nodes in left subtree
       int leftSize = index - inStart;

       // Build Left Subtree
       root.left = build(preorder, inorder,
               preStart + 1,
               preStart + leftSize,
               inStart,
               index - 1);

       // Build Right Subtree
       root.right = build(preorder, inorder,
               preStart + leftSize + 1,
               preEnd,
               index + 1,
               inEnd);

       return root;

   }
}
