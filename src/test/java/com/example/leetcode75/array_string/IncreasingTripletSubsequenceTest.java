package com.example.leetcode75.array_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncreasingTripletSubsequenceTest {

    @Test
    void increasingTripletExample1() {
        assertThat(IncreasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 3, 4, 5})).isEqualTo(true);
    }

    @Test
    void increasingTripletExample2() {
        assertThat(IncreasingTripletSubsequence.increasingTriplet(new int[]{5, 4, 3, 2, 1})).isEqualTo(false);
    }

    @Test
    void increasingTripletExample3() {
        assertThat(IncreasingTripletSubsequence.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6})).isEqualTo(true);
    }

    @Test
    void increasingTripletExample4() {
        assertThat(IncreasingTripletSubsequence.increasingTriplet(new int[]{20, 100, 10, 12, 5, 11, 13})).isEqualTo(true);
    }
}