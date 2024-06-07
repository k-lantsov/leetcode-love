package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class RomanToIntegerTest {

    @Test
    void romanToIntExample1() {
        assertThat(RomanToInteger.romanToInt("XX")).isEqualTo(20);
    }

    @Test
    void romanToIntExample2() {
        assertThat(RomanToInteger.romanToInt("III")).isEqualTo(3);
    }

    @Test
    void romanToIntExample3() {
        assertThat(RomanToInteger.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    void romanToIntExample4() {
        assertThat(RomanToInteger.romanToInt("MCMXCIV")).isEqualTo(1994);
    }

    @Test
    void romanToIntExample5() {
        assertThat(RomanToInteger.romanToInt("XIX")).isEqualTo(19);
    }
}