package data_structures.trees;

import neetcode.trees.TreeNode;

public class BalancedTree {
    public boolean isBalancedTree(TreeNode root) {
        return traverseTreeAndCalculateHeight(root)[0] == 1;
    }

    public int[] traverseTreeAndCalculateHeight(TreeNode root) {
        if(root == null) {
            return new int[] {1,0};
        }

        int[] leftSide = traverseTreeAndCalculateHeight(root.left);
        int[] rightSide = traverseTreeAndCalculateHeight(root.right);

        int heightOfBinaryTree = 1 + Math.max(leftSide[1], rightSide[1]);

        boolean isBalanced = (leftSide[0] == 1 && rightSide[0] == 1) && Math.abs(leftSide[1] - rightSide[1]) <= 1;

        return new int[] {isBalanced ? 1 : 0, heightOfBinaryTree};
    }
}
