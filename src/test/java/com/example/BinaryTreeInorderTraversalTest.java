package com.example;

import com.example.BinaryTreeInorderTraversal.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeInorderTraversalTest {

    @Test
    void inorderTraversalExample1() {
        TreeNode node2 = new TreeNode(3, null, null);
        TreeNode node1 = new TreeNode(2, node2, null);
        TreeNode root = new TreeNode(1, null, node1);
        assertThat(BinaryTreeInorderTraversal.inorderTraversal(root)).isEqualTo(List.of(1, 3, 2));
    }

    @Test
    void inorderTraversalExample2() {
        assertThat(BinaryTreeInorderTraversal.inorderTraversal(null)).isEqualTo(Collections.EMPTY_LIST);
    }

    @Test
    void inorderTraversalExample3() {
        TreeNode root = new TreeNode(1, null, null);
        assertThat(BinaryTreeInorderTraversal.inorderTraversal(root)).isEqualTo(List.of(1));
    }
}