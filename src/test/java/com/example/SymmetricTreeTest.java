package com.example;

import com.example.SymmetricTree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SymmetricTreeTest {

    @Test
    void isSymmetricExample1() {
        TreeNode node21 = new TreeNode(3);
        TreeNode node22 = new TreeNode(4);
        TreeNode node11 = new TreeNode(2, node21, node22);
        TreeNode node23 = new TreeNode(4);
        TreeNode node24 = new TreeNode(3);
        TreeNode node12 = new TreeNode(2, node23, node24);
        TreeNode root = new TreeNode(1, node11, node12);

        assertThat(SymmetricTree.isSymmetric(root)).isEqualTo(true);
    }

    @Test
    void isSymmetricExample2() {
        TreeNode node22 = new TreeNode(3);
        TreeNode node11 = new TreeNode(2, null, node22);
        TreeNode node24 = new TreeNode(3);
        TreeNode node12 = new TreeNode(2, null, node24);
        TreeNode root = new TreeNode(1, node11, node12);

        assertThat(SymmetricTree.isSymmetric(root)).isEqualTo(false);
    }
}