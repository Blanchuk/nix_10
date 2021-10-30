package ua.com.alevel.leveltwo.tree;

public class TreeNode {
    private final int value;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int x) { value = x; }

    public int getValue() {
        return this.value;
    }

    public TreeNode getLeftChild() {
        return this.left;
    }

    public void setLeftChild(final TreeNode leftChild) {
        this.left = leftChild;
    }

    public TreeNode getRightChild() {
        return this.right;
    }

    public void setRightChild(final TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", leftChild=" + left +
                ", rightChild=" + right +
                '}';
    }
}
