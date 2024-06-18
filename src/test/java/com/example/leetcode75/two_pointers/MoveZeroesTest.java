package com.example.leetcode75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {

    @Test
    void moveZeroesExample1() {
        assertThat(MoveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12})).isEqualTo(new int[]{1, 3, 12, 0, 0});
    }

    @Test
    void moveZeroesExample2() {
        assertThat(MoveZeroes.moveZeroes(new int[]{0})).isEqualTo(new int[]{0});
    }

    @Test
    void moveZeroesExample3() {
        assertThat(MoveZeroes.moveZeroes(new int[]{2, 1, 0, 3, 0, 8, 12})).isEqualTo(new int[]{2, 1, 3, 8, 12, 0, 0});
    }
}