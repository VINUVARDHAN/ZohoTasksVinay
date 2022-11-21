//$Id$
package com.learn.java.Problems;

public class AncestorsOfNode {
    static int val;

    public static void main(String[] args) {
        Nodes root = new Nodes(1);
        root.left = new Nodes(2);
        root.right = new Nodes(3);
        root.left.left = new Nodes(4);
        root.left.right = new Nodes(5);
        root.right.left = new Nodes(6);
        root.right.right = new Nodes(7);
        root.right.left.left = new Nodes(8);
        root.right.right.right = new Nodes(9);
        val = 8;
        start(root);
    }

    static boolean start(Nodes node) {
        if (node == null) {
            return false;
        }
        if (node.data == val) {
            return true;

        }
        if (start(node.left) || start(node.right)) {
            System.out.println(node.data);
            return true;
        }
        return false;
    }
}
