package com.example.leetcode75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubarrayAfterDeletingElementTest {

    @Test
    void longestSubarrayExample1() {
        assertThat(LongestSubarrayAfterDeletingElement.longestSubarray(new int[]{1, 1, 0, 1})).isEqualTo(3);
    }

    @Test
    void longestSubarrayExample2() {
        assertThat(LongestSubarrayAfterDeletingElement.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1})).isEqualTo(5);
    }

    @Test
    void longestSubarrayExample3() {
        assertThat(LongestSubarrayAfterDeletingElement.longestSubarray(new int[]{1, 1, 1})).isEqualTo(2);
    }
}