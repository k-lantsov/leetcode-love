package com.example.leetcode75.binary_tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LeftSimilarTreesTest {

    @Test
    void leafSimilarExample1() {
        TreeNode node11 = new TreeNode(1, null, null);
        TreeNode node12 = new TreeNode(3, null, null);
        TreeNode node10 = new TreeNode(2, node11, node12);

        TreeNode node21 = new TreeNode(1, null, null);
        TreeNode node22 = new TreeNode(3, null, null);
        TreeNode node20 = new TreeNode(3, node21, node22);
        Assertions.assertThat(LeftSimilarTrees.leafSimilar(node10, node20)).isEqualTo(true);
    }

    @Test
    void leafSimilarExample2() {
        TreeNode node11 = new TreeNode(1, null, null);
        TreeNode node12 = new TreeNode(3, null, null);
        TreeNode node10 = new TreeNode(2, node11, node12);

        TreeNode node21 = new TreeNode(2, null, null);
        TreeNode node22 = new TreeNode(5, null, null);
        TreeNode node20 = new TreeNode(4, node21, node22);
        Assertions.assertThat(LeftSimilarTrees.leafSimilar(node10, node20)).isEqualTo(false);
    }
}