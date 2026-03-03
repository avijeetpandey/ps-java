package neetcode.ebay_prep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import neetcode.trees.TreeNode;

public class SerialiseAndDeserialiseBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    public void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N").append(",");
            return;
        }

        sb.append(root.val).append(",");
        buildString(root.left, sb);
        buildString(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }

    public TreeNode buildTree(Queue<String> nodes) {
        String value = nodes.poll();

        if (value.equals("N")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(value));

        node.left = buildTree(nodes);
        node.right = buildTree(nodes);

        return node;
    }
}
