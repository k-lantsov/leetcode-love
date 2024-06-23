package com.example.leetcode75.hashmap_hashset;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualRowAndColumnPairsTest {

    @Test
    void equalPairs1Example1() {
        assertThat(EqualRowAndColumnPairs.equalPairs1(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}})).isEqualTo(1);
    }

    @Test
    void equalPairs1Example2() {
        assertThat(EqualRowAndColumnPairs.equalPairs1(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}})).isEqualTo(3);
    }

    @Test
    void equalPairs1Example3() {
        assertThat(EqualRowAndColumnPairs.equalPairs1(new int[][]{{13, 13}, {13, 13}})).isEqualTo(4);
    }

    @Test
    void equalPairs2Example1() {
        assertThat(EqualRowAndColumnPairs.equalPairs2(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}})).isEqualTo(1);
    }

    @Test
    void equalPairs2Example2() {
        assertThat(EqualRowAndColumnPairs.equalPairs2(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}})).isEqualTo(3);
    }

    @Test
    void equalPairs2Example3() {
        assertThat(EqualRowAndColumnPairs.equalPairs2(new int[][]{{13, 13}, {13, 13}})).isEqualTo(4);
    }
}