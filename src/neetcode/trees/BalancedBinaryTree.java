package neetcode.trees;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }

    private int[] dfs(TreeNode root) {
        if(root == null) {
            return new int[]{1,0};
        }

        int[] leftSide = dfs(root.left);
        int[] rightSide = dfs(root.right);

        boolean balanced = (leftSide[0] == 1 && rightSide[0] == 1) && (Math.abs(leftSide[1] - rightSide[1]) <= 1);
        int height = 1 + Math.max(leftSide[1], rightSide[1]);

        return new int[] {balanced ? 1 : 0, height};
    }
}
