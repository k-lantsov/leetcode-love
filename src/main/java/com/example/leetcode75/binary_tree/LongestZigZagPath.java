package com.example.leetcode75.binary_tree;

public class LongestZigZagPath {

    private static final String LEFT = "left";
    private static final String RIGHT = "right";
    private int count = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        findLongestPath(root.left, LEFT, 1);
        findLongestPath(root.right, RIGHT, 1);

        return count;
    }

    private void findLongestPath(TreeNode node, String direction, int length) {
        if (node == null) {
            return;
        }
        count = Math.max(length, count);
        if (LEFT.equals(direction)) {
            findLongestPath(node.right, RIGHT, ++length);
            findLongestPath(node.left, LEFT, 1);
        }
        if (RIGHT.equals(direction)) {
            findLongestPath(node.left, LEFT, ++length);
            findLongestPath(node.right, RIGHT, 1);
        }
    }
}
