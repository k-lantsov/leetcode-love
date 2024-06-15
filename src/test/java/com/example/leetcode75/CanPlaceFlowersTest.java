package com.example.leetcode75;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CanPlaceFlowersTest {

    @Test
    void canPlaceFlowersExample1() {
        assertThat(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isEqualTo(true);
    }

    @Test
    void canPlaceFlowersExample2() {
        assertThat(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isEqualTo(false);
    }

    @Test
    void canPlaceFlowersExample3() {
        assertThat(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 1, 0, 1, 0, 1}, 1)).isEqualTo(false);
    }

    @Test
    void canPlaceFlowersExample4() {
        assertThat(CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1)).isEqualTo(true);
    }

    @Test
    void canPlaceFlowersExample5() {
        assertThat(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2)).isEqualTo(true);
    }
}