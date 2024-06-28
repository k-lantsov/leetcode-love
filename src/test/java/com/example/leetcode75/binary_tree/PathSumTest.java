package com.example.leetcode75.binary_tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PathSumTest {

    @Test
    void pathSumExample1() {
        TreeNode node31 = new TreeNode(3, null, null);
        TreeNode node32 = new TreeNode(-2, null, null);
        TreeNode node34 = new TreeNode(1, null, null);
        TreeNode node21 = new TreeNode(3, node31, node32);
        TreeNode node22 = new TreeNode(2, null, node34);
        TreeNode node24 = new TreeNode(11, null, null);
        TreeNode node11 = new TreeNode(5, node21, node22);
        TreeNode node12 = new TreeNode(-3, null, node24);
        TreeNode node0 = new TreeNode(10, node11, node12);
        Assertions.assertThat(PathSum.pathSum(node0, 8)).isEqualTo(3);
    }
}