package data_structures.trees;

import neetcode.trees.TreeNode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);

        int diameterAtLevel = leftHeight + rightHeight;

        int diameterAtSubLevel = diameterOfBinaryTree(root.left) + diameterOfBinaryTree(root.right);

        return Math.max(diameterAtLevel, diameterAtSubLevel);
    }

    public int heightOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right));
    }
}
