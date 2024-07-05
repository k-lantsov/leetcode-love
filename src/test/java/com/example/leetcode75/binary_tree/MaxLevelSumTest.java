package com.example.leetcode75.binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxLevelSumTest {

    @Test
    void maxLevelSumExample1() {
        MaxLevelSum maxLevelSum = new MaxLevelSum();
        TreeNode node21 = new TreeNode(2, null, null);
        TreeNode node22 = new TreeNode(7, null, null);
        TreeNode node11 = new TreeNode(3, node21, node22);
        TreeNode node12 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(8, node11, node12);
        assertThat(maxLevelSum.maxLevelSum(root)).isEqualTo(2);
    }
}