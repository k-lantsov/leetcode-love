package com.example.leetcode75.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumTwinSumTest {

    @Test
    void pairSum() {
        ListNode node4 = new ListNode(1, null);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(5, node2);
        Assertions.assertThat(MaximumTwinSum.pairSum(node1)).isEqualTo(6);
    }
}