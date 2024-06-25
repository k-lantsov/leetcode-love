package com.example.leetcode75.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddEvenLinkedListTest {

    @Test
    void oddEvenListExample1() {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode ans4 = new ListNode(4, null);
        ListNode ans2 = new ListNode(2, ans4);
        ListNode ans5 = new ListNode(5, ans2);
        ListNode ans3 = new ListNode(3, ans5);
        ListNode ans1 = new ListNode(1, ans3);
        assertThat(OddEvenLinkedList.oddEvenList(node1)).isEqualTo(ans1);
    }

    @Test
    void oddEvenListExample2() {
        ListNode node2 = new ListNode(2, null);
        ListNode node1 = new ListNode(1, node2);
        assertThat(OddEvenLinkedList.oddEvenList(node1)).isEqualTo(node1);
    }
}