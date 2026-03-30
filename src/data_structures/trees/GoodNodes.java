package data_structures.trees;

import neetcode.trees.TreeNode;

public class GoodNodes {
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }

    public int dfs(TreeNode node, int maxValSoFar) {
        if(node == null) {
            return 0;
        }

        int count = 0;

        if(node.val >= maxValSoFar) {
            count = 1;
        }

        int newMax = Math.max(maxValSoFar, node.val);

        count += dfs(node.left, newMax);
        count += dfs(node.right, newMax);

        return count;
    }
}
