package com.example.leetcode75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxNumberOfKSumPairsTest {

    @Test
    void maxOperationsExample1() {
        assertThat(MaxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4}, 5)).isEqualTo(2);
    }

    @Test
    void maxOperationsExample2() {
        assertThat(MaxNumberOfKSumPairs.maxOperations(new int[]{3, 1, 3, 4, 3}, 6)).isEqualTo(1);
    }

    @Test
    void maxOperationsExample3() {
        assertThat(MaxNumberOfKSumPairs.maxOperations(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3))
                .isEqualTo(4);
    }

    @Test
    void maxOperations2PointersExample1() {
        assertThat(MaxNumberOfKSumPairs.maxOperations2Pointers(new int[]{1, 2, 3, 4}, 5)).isEqualTo(2);
    }

    @Test
    void maxOperations2PointersExample2() {
        assertThat(MaxNumberOfKSumPairs.maxOperations2Pointers(new int[]{3, 1, 3, 4, 3}, 6)).isEqualTo(1);
    }

    @Test
    void maxOperations2PointersExample3() {
        assertThat(MaxNumberOfKSumPairs.maxOperations2Pointers(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3))
                .isEqualTo(4);
    }
}