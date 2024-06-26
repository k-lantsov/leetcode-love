package com.example.leetcode75.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void reverseListIterativelyExample1() {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode ans1 = new ListNode(1, null);
        ListNode ans2 = new ListNode(2, ans1);
        ListNode ans3 = new ListNode(3, ans2);
        ListNode ans4 = new ListNode(4, ans3);
        ListNode ans5 = new ListNode(5, ans4);
        Assertions.assertThat(ReverseLinkedList.reverseListIteratively(node1)).isEqualTo(ans5);
    }

    @Test
    void reverseListRecursivelyExample1() {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode ans1 = new ListNode(1, null);
        ListNode ans2 = new ListNode(2, ans1);
        ListNode ans3 = new ListNode(3, ans2);
        ListNode ans4 = new ListNode(4, ans3);
        ListNode ans5 = new ListNode(5, ans4);
        Assertions.assertThat(ReverseLinkedList.reverseListRecursively(node1)).isEqualTo(ans5);
    }
}