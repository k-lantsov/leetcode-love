package com.example.leetcode75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecutiveOnesTest {

    @Test
    void longestOnesExample1() {
        assertThat(MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2))
                .isEqualTo(6);
    }

    @Test
    void longestOnesExample2() {
        assertThat(MaxConsecutiveOnes.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3))
                .isEqualTo(10);
    }

    @Test
    void longestOnesExample3() {
        assertThat(MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 0, 0}, 2))
                .isEqualTo(5);
    }

    @Test
    void longestOnesExample4() {
        assertThat(MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 0, 1, 0, 1}, 2))
                .isEqualTo(5);
    }
}