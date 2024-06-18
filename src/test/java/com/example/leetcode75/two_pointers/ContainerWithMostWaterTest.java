package com.example.leetcode75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerWithMostWaterTest {

    @Test
    void maxAreaExample1() {
        assertThat(ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
    }

    @Test
    void maxAreaExample2() {
        assertThat(ContainerWithMostWater.maxArea(new int[]{1, 1})).isEqualTo(1);
    }
}