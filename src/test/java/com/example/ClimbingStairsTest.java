package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    @Test
    void climbStairsExample1() {
        assertThat(ClimbingStairs.climbStairs(2)).isEqualTo(2);
    }

    @Test
    void climbStairsExample2() {
        assertThat(ClimbingStairs.climbStairs(3)).isEqualTo(3);
    }
}