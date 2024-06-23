package com.example.leetcode75.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemovingStarsFromStringTest {

    @Test
    void removeStarsExample1() {
        assertThat(RemovingStarsFromString.removeStars("leet**cod*e")).isEqualTo("lecoe");
    }

    @Test
    void removeStarsExample2() {
        assertThat(RemovingStarsFromString.removeStars("erase*****")).isEqualTo("");
    }
}