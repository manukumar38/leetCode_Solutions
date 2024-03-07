package com.leetcode.solutions;

import java.util.Random;

public class BinaryTree {

    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print(
                "Inorder traversal before insertion:");
        print(root);
    }

    static void print(Node node)
    {
        if (node == null)
            return;

        print(node.left);
        System.out.print(node.key + " ");
        print(node.right);
    }
}

class Node {
    int key;
    Node left, right;

    // constructor
    Node(int key)
    {
        this.key = key;
        left = null;
        right = null;
    }
}