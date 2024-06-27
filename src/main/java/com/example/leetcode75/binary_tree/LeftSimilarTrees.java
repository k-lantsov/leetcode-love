package com.example.leetcode75.binary_tree;

import java.util.Stack;

public class LeftSimilarTrees {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> leaves1 = new Stack<>();
        Stack<Integer> leaves2 = new Stack<>();
        getLeaves(root1, leaves1);
        getLeaves(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private static void getLeaves(TreeNode root, Stack<Integer> leaves) {
        if (root.left == null && root.right == null) {
            leaves.push(root.val);
            return;
        }
        if (root.left != null) {
            getLeaves(root.left, leaves);
        }
        if (root.right != null) {
            getLeaves(root.right, leaves);
        }
    }
}
