package com.example.leetcode75.prefix_sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindHighestAltitudeTest {

    @Test
    void largestAltitudeExample1() {
        Assertions.assertThat(FindHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7})).isEqualTo(1);
    }

    @Test
    void largestAltitudeExample2() {
        Assertions.assertThat(FindHighestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})).isEqualTo(0);
    }
}