package org.java.binarytree;

public class BinaryNode {
    private BinaryNode left;
    private BinaryNode right;
    private int value;

    public BinaryNode(BinaryNode left, BinaryNode right, int current) {
        this.left = left;
        this.right = right;
        this.value = current;
    }
    public BinaryNode(int current){
        this.value = current;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public int getCurrent() {
        return value;
    }

    public void setCurrent(int current) {
        this.value = current;
    }

    @Override
    public String toString() {
        return String.format("{\nvalue - %d,\nleft - %s,\nright - %s\n}", value, left, right);
    }
}
