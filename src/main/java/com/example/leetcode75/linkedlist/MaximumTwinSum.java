package com.example.leetcode75.linkedlist;

public class MaximumTwinSum {

    public static int pairSum(ListNode head) {
        if (head.next.next == null) {
            return head.val + head.next.val;
        }

        ListNode middleNode = findMiddle(head);

        ListNode reversedSecondHalfHead = reverse(middleNode);

        int ans = 0;
        ListNode fromHalf1 = head;
        ListNode fromHalf2 = reversedSecondHalfHead;
        while (fromHalf2 != null) {
            ans = Math.max(ans, fromHalf1.val + fromHalf2.val);
            fromHalf1 = fromHalf1.next;
            fromHalf2 = fromHalf2.next;
        }
        return ans;
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode slow = new ListNode(-1, head);
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    private static ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode prev = null;
        ListNode current = node;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
