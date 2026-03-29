package data_structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import neetcode.trees.TreeNode;

public class RightSideViewOfBinaryTree {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();


        if(root == null) {
            return result;
        }

        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for(int i=0;i<levelSize;i++) {
                TreeNode currentNode = queue.poll();

                if(i == levelSize - 1) {
                    result.add(currentNode.val);
                }

                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        return result;
    }
}
