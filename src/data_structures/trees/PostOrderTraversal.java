package data_structures.trees;

import java.util.ArrayList;
import java.util.List;

import neetcode.trees.TreeNode;

public class PostOrderTraversal {
        public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if(root == null) {
            return list;
        }

        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);

        return list;
    }
}
