package org.java;

import org.java.binarytree.BinaryNode;

public class Main {
    public static void main(String[] args) {

        BinaryNode root = new BinaryNode(5);
        var two = new BinaryNode(2);
        var six = new BinaryNode(6);
        root.setLeft(two);
        root.setRight(six);
        System.out.println("Binary Tree -" +  root);

    }
}