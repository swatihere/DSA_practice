package BinaryTree;

import java.util.ArrayList;

public class RightViewOfBinaryTree {
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        view(root,0,ans);  // Start DFS from level 0
        return ans;
    }

    private void view(Node root, int level, ArrayList<Integer> ans) {
        if (root == null) return;
        if (level >= ans.size()) {   // If this level is visited for the first time
            ans.add(root.val);
        }
        else {
            ans.set(level, root.val);  // Replace previous value with current node
        }
        view(root.left, level+1, ans);
        view(root.right, level+1, ans);
    }


}
