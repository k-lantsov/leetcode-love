package com.example.leetcode75.binary_tree;

public class CountGoodNodes {

    public static int goodNodes(TreeNode root) {
        int counter = 0;
        int max = root.val;
        counter = countGoodNodes(root, counter, max);
        return counter;
    }

    private static int countGoodNodes(TreeNode node, int counter, int max) {
        if (node.val >= max) {
            max = node.val;
            counter++;
        }
        if (node.left == null && node.right == null) {
            return counter;
        }
        if (node.left != null) {
            counter = countGoodNodes(node.left, counter, max);
        }
        if (node.right != null) {
            counter = countGoodNodes(node.right, counter, max);
        }
        return counter;
    }
}
