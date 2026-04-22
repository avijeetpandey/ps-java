package data_structures.trees;

import neetcode.trees.TreeNode;

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
