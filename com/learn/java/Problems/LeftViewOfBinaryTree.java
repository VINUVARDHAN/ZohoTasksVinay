//$Id$
package com.learn.java.Problems;

class Nodes {
    int data;
    Nodes left, right;

    Nodes(int data) {
        this.data = data;
        left = right = null;

    }
}

class LeftView {
    static int maxLevel = 0;

    void startLeftView(Nodes node, int level) {
        if (node == null) {
            return;
        } else {
            if (level > maxLevel) {

                System.out.println(node.data);
                maxLevel = level;
            }
            startLeftView(node.left, level + 1);
            startLeftView(node.right, level + 1);
        }

    }

    void instantiation(Nodes root) {
        maxLevel = 0;
        startLeftView(root, 1);
    }
}

class LeftViewOfBinaryTree {
    public static void main(String[] args) {
        Nodes root = new Nodes(10);
        root.left = new Nodes(2);
        root.left.left = new Nodes(7);
        root.left.right = new Nodes(8);
        root.right = new Nodes(3);
        root.right.left = new Nodes(12);
        root.right.right = new Nodes(15);
        root.right.right.left = new Nodes(14);
        LeftView l = new LeftView();
        l.instantiation(root);
    }
}