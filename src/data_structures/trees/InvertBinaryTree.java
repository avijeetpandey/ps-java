package data_structures.trees;

import neetcode.trees.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        // swap the nodes
        TreeNode tempNode = root.left;
        root.right = root.left;
        root.left = tempNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
