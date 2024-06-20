package com.example.leetcode75.prefix_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindPivotIndexTest {

    @Test
    void pivotIndexExample1() {
        assertThat(FindPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6})).isEqualTo(3);
    }

    @Test
    void pivotIndexExample2() {
        assertThat(FindPivotIndex.pivotIndex(new int[]{1, 2, 3})).isEqualTo(-1);
    }

    @Test
    void pivotIndexExample3() {
        assertThat(FindPivotIndex.pivotIndex(new int[]{2, 1, -1})).isEqualTo(0);
    }
}