package com.example.leetcode75.binary_tree;

public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        TreeNode ans;
        ans = searchBST(root.left, val);
        if (ans == null) {
            ans = searchBST(root.right, val);
        }
        return ans;
    }
}
