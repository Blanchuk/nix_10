package ua.com.alevel.leveltwo.tree;

public class Tree {

    private TreeNode rootNode;

    public TreeNode getRootNode() {
        return rootNode;
    }

    public Tree() {
        rootNode = null;
    }

    public void insertNode(int value) {
        TreeNode newNode = new TreeNode(value);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            TreeNode currentNode = rootNode;
            TreeNode parentNode;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.getLeftChild());
        int right = maxDepth(root.getRightChild());
        return Math.max(left, right) + 1;
    }
}
