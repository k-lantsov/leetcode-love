package com.example.leetcode75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumAverageSubarrayTest {

    @Test
    void findMaxAverageExample1() {
        assertThat(MaximumAverageSubarray.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4)).isEqualTo(12.75);
    }

    @Test
    void findMaxAverageExample2() {
        assertThat(MaximumAverageSubarray.findMaxAverage(new int[]{5}, 1)).isEqualTo(5);
    }
}