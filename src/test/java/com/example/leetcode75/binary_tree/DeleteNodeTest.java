package com.example.leetcode75.binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteNodeTest {

    @Test
    void deleteNodeExample1() {
        DeleteNode deleteNode = new DeleteNode();
        TreeNode node21 = new TreeNode(2, null, null);
        TreeNode node22 = new TreeNode(4, null, null);
        TreeNode node24 = new TreeNode(7, null, null);
        TreeNode node11 = new TreeNode(3, node21, node22);
        TreeNode node12 = new TreeNode(6, null, node24);
        TreeNode root = new TreeNode(5, node11, node12);

        TreeNode ansNode21 = new TreeNode(2, null, null);
        TreeNode ansNode24 = new TreeNode(7, null, null);
        TreeNode ansNode11 = new TreeNode(4, ansNode21, null);
        TreeNode ansNode12 = new TreeNode(6, null, ansNode24);
        TreeNode ansRoot = new TreeNode(5, ansNode11, ansNode12);
        assertThat(deleteNode.deleteNode(root, 3)).isEqualTo(ansRoot);
    }
}