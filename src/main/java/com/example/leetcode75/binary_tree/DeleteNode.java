package com.example.leetcode75.binary_tree;

public class DeleteNode {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            //to find inorder successor
            root.val = minimum(root.right);

            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private int minimum(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }
}
