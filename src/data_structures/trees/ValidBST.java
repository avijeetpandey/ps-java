package data_structures.trees;

import neetcode.trees.TreeNode;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode node, Integer min, Integer max) {
        if(node == null) {
            return true;
        }

        // check for main condition
        if((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // do the same for left and right nodes
        return validate(node.left, min, node.val) && validate(node.right, node.val,max);
    }
}
