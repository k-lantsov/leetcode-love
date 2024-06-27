package com.example.leetcode75.binary_tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxDepthTest {

    @Test
    void maxDepthExample1() {
        TreeNode node23 = new TreeNode(15, null, null);
        TreeNode node24 = new TreeNode(15, null, null);
        TreeNode node11 = new TreeNode(9, null, null);
        TreeNode node12 = new TreeNode(20, node23, node24);
        TreeNode node0 = new TreeNode(3, node11, node12);
        Assertions.assertThat(MaxDepth.maxDepth(node0)).isEqualTo(3);
    }

    @Test
    void maxDepthExample2() {
        TreeNode node12 = new TreeNode(2, null, null);
        TreeNode node0 = new TreeNode(1, null, node12);
        Assertions.assertThat(MaxDepth.maxDepth(node0)).isEqualTo(2);
    }
}