package implementations;

public class BinaryTree {
    private BinaryTreeNode root;

    private static class BinaryTreeNode {
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }

    public void addLeft(int data) {
        BinaryTreeNode node = new BinaryTreeNode(data);

        if(root != null) {
            root.left = node;
        }
    }

    public void addRight(int data) {
        BinaryTreeNode node = new BinaryTreeNode(data);
        if(root != null) {
            root.right = node;
        }
    }
}
