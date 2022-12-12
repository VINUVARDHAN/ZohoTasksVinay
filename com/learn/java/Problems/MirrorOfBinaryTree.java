//$Id$
package com.learn.java.Problems;

public class MirrorOfBinaryTree {
    public static void main(String[] args) {
        Nodes root = new Nodes(10);
        root.left = new Nodes(2);
        root.left.left = new Nodes(7);
        root.left.right = new Nodes(8);
        root.right = new Nodes(2);
        root.right.left = new Nodes(8);
        root.right.right = new Nodes(7);
        root.left.left.right = new Nodes(14);
        root.right.right.left = new Nodes(14);
        Mirror l = new Mirror();
        System.out.println(l.initialize(root));
    }
}

class Mirror {
    boolean initialize(Nodes node) {
        return mirror(node, node);
    }

    boolean mirror(Nodes node1, Nodes node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 != null && node2 != null && node1.data == node2.data) {
            return (mirror(node1.left, node2.right) && mirror(node1.right, node2.left));
        }
        return false;
    }
}