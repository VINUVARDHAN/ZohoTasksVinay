//$Id$
package com.learn.java.Problems;

class MaxPathOfTheTree {
    public static void main(String[] args) {
        Nodes node = new Nodes(-1);
        node.left = new Nodes(6);
        node.left.left = new Nodes(1);
        node.left.right = new Nodes(2);
        node.right = new Nodes(6);
        node.right.left = new Nodes(-5);
        node.right.left.left = new Nodes(27);
        Solutions s = new Solutions();
        System.out.println("Maximum path of the binary tree is : " + s.startFinding(node));
    }
}

class Solutions {
    int max_value = Integer.MIN_VALUE;

    int startFinding(Nodes root) {
        findMaxPath(root);
        return max_value;
    }

    int findMaxPath(Nodes node) {
        if (node == null)
            return 0;
        int left_side_data = Math.max(0, findMaxPath(node.left));
        int right_side_data = Math.max(0, findMaxPath(node.right));
        // case : 1
        // here we are storing the max value of root+left+right thinking
        // that no path other than it exists in binary tree
        max_value = Math.max(left_side_data + right_side_data + node.data, max_value);
        // case : 2
        // here we are returning length of straight path to check if
        // any path exist that might replace max_value
        return Math.max(left_side_data, right_side_data) + node.data;
    }

}
