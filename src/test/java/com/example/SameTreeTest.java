package com.example;

import com.example.SameTree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SameTreeTest {

    @Test
    void isSameTreeExample1() {
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(3);
        TreeNode p0 = new TreeNode(1, p1, p2);
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);
        TreeNode q0 = new TreeNode(1, q1, q2);

        assertThat(SameTree.isSameTree(p0, q0)).isEqualTo(true);
    }

    @Test
    void isSameTreeExample2() {
        TreeNode p1 = new TreeNode(2);
        TreeNode p0 = new TreeNode(1, p1, null);
        TreeNode q1 = new TreeNode(2);
        TreeNode q0 = new TreeNode(1, null, q1);

        assertThat(SameTree.isSameTree(p0, q0)).isEqualTo(false);
    }

    @Test
    void isSameTreeExample3() {
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(1);
        TreeNode p0 = new TreeNode(1, p1, p2);
        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);
        TreeNode q0 = new TreeNode(1, q1, q2);

        assertThat(SameTree.isSameTree(p0, q0)).isEqualTo(false);
    }
}