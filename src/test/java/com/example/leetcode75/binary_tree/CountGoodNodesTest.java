package com.example.leetcode75.binary_tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CountGoodNodesTest {

    @Test
    void goodNodesExample1() {
        TreeNode node23 = new TreeNode(3, null, null);
        TreeNode node24 = new TreeNode(5, null, null);
        TreeNode node11 = new TreeNode(2, null, null);
        TreeNode node12 = new TreeNode(4, node23, node24);
        TreeNode node0 = new TreeNode(3, node11, node12);
        Assertions.assertThat(CountGoodNodes.goodNodes(node0)).isEqualTo(3);
    }

    @Test
    void goodNodesExample2() {
        TreeNode node0 = new TreeNode(3, null, null);
        Assertions.assertThat(CountGoodNodes.goodNodes(node0)).isEqualTo(1);
    }
}