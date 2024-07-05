package com.example.leetcode75.binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchBSTTest {

    @Test
    void searchBSTExample1() {
        SearchBST searchBST = new SearchBST();
        TreeNode node21 = new TreeNode(1, null, null);
        TreeNode node22 = new TreeNode(3, null, null);
        TreeNode node11 = new TreeNode(2, node21, node22);
        TreeNode node12 = new TreeNode(7, null, null);
        TreeNode root = new TreeNode(4, node11, node12);
        assertThat(searchBST.searchBST(root, 7)).isEqualTo(node12);
    }
}