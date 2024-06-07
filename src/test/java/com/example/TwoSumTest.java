package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TwoSumTest {

    @Test
    void twoSumExample1() {
        assertThat(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void twoSumExample2() {
        assertThat(TwoSum.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void twoSumExample3() {
        assertThat(TwoSum.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void twoSumExample4() {
        assertThat(TwoSum.twoSum(new int[]{3, 0}, 6)).isEqualTo(new int[]{-1, -1});
    }
}