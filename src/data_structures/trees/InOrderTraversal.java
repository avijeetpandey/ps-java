package data_structures.trees;

import java.util.ArrayList;
import java.util.List;

import neetcode.trees.TreeNode;

public class InOrderTraversal {
        public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if(root == null) {
            return list;
        }

        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}
