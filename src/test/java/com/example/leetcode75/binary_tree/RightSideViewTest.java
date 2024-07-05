package com.example.leetcode75.binary_tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RightSideViewTest {

    @Test
    void rightSideViewExample1() {
        RightSideView rightSideView = new RightSideView();
        TreeNode node22 = new TreeNode(2, null, null);
        TreeNode node11 = new TreeNode(1, null, node22);
        TreeNode node12 = new TreeNode(4, null, null);
        TreeNode root = new TreeNode(3, node11, node12);
        assertThat(rightSideView.rightSideView(root)).isEqualTo(List.of(3, 4, 2));
    }
}