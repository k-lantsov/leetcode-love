package com.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTreeWalk(root, ans);
        return ans;
    }

    private static void inorderTreeWalk(TreeNode node, List<Integer> nodes) {
        if (node != null) {
            if (node.left != null) {
                inorderTreeWalk(node.left, nodes);
            }
            nodes.add(node.val);
            if (node.right != null) {
                inorderTreeWalk(node.right, nodes);
            }
        }
    }
}
