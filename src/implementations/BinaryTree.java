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

    public void displayInOrderTraversal(BinaryTreeNode rootNode) {
        if(rootNode == null) {
            return;
        }

        displayInOrderTraversal(rootNode.left);
        System.out.println(rootNode.data + " -> ");
        displayInOrderTraversal(rootNode.right);
    }

    public void displayPreOrderTraversal(BinaryTreeNode rootNode) {
        if(rootNode == null) {
            return;
        }

        System.out.println(rootNode.data + " ");
        displayPreOrderTraversal(rootNode.left);
        displayPreOrderTraversal(rootNode.right);
    }

    public void displayPostOrderTraversal(BinaryTreeNode rootNode) {
        if(rootNode == null) {
            return;
        }

        displayPostOrderTraversal(rootNode.left);
        displayPostOrderTraversal(rootNode.right);
        System.out.println(rootNode.data + " ");
    }
}
