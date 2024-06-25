package com.example.leetcode75.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteMiddleNodeTest {

    @Test
    void deleteMiddleExample1() {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        assertThat(DeleteMiddleNode.deleteMiddle(node1)).isEqualTo(node1);
    }
}