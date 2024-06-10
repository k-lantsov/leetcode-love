package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {

    @Test
    void plusOneExample1() {
        assertThat(PlusOne.plusOne(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
    }

    @Test
    void plusOneExample2() {
        assertThat(PlusOne.plusOne(new int[]{4, 3, 2, 9})).isEqualTo(new int[]{4, 3, 3, 0});
    }

    @Test
    void plusOneExample4() {
        assertThat(PlusOne.plusOne(new int[]{9, 9, 9})).isEqualTo(new int[]{1, 0, 0, 0});
    }
}