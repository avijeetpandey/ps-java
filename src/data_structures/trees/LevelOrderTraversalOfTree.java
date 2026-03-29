package data_structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import neetcode.trees.TreeNode;

public class LevelOrderTraversalOfTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int currentLevel = queue.size();
            List<Integer> currentLevelNodes = new ArrayList<>();

            for(int i=0;i<currentLevel;i++) {
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                } 

                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }

                currentLevelNodes.add(currentNode.val);
            }

            result.add(currentLevelNodes);
        }

        return result;
    }
}
