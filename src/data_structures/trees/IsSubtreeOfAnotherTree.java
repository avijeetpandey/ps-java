package data_structures.trees;

import neetcode.trees.TreeNode;

public class IsSubtreeOfAnotherTree {
    public boolean isSubTree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
           return false;
        }

        if(subRoot == null) {
            return false;
        }

        if(isSameTree(root, subRoot)){
            return true;
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);

    }

    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }

        if(root != null && subRoot != null && root.val == subRoot.val) {
            return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
        } else {
            return false;
        }
    }
}
