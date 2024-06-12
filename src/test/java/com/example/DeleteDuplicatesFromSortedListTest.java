package com.example;

import com.example.DeleteDuplicatesFromSortedList.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteDuplicatesFromSortedListTest {

    @Test
    void deleteDuplicatesExample1() {
        DeleteDuplicatesFromSortedList example1 = new DeleteDuplicatesFromSortedList();
        ListNode inputNode3 = new ListNode(2, null);
        ListNode inputNode2 = new ListNode(1, inputNode3);
        ListNode inputNode1 = new ListNode(1, inputNode2);
        assertThat(example1.deleteDuplicates(inputNode1).next).isEqualTo(inputNode3);
    }
}