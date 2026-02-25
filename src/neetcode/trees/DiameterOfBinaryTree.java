package neetcode.trees;

public class DiameterOfBinaryTree {
    public int diameter(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int diameterAtLevel = leftHeight + rightHeight;

        int subDiameter = Math.max(diameter(root.left), diameter(root.right));

        return Math.max(diameterAtLevel, subDiameter);
    }

    public int heightOfTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int rightHeight = heightOfTree(root.right);
        int leftHeight = heightOfTree(root.left);

        return 1 + Math.max(rightHeight, leftHeight);
    }
}
