package com.example.leetcode75.array_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreatestCommonDivisorOfStringsTest {

    @Test
    void gcdOfStringsExample1() {
        assertThat(GreatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC")).isEqualTo("ABC");
    }

    @Test
    void gcdOfStringsExample2() {
        assertThat(GreatestCommonDivisorOfStrings.gcdOfStrings("ABABAB", "AB")).isEqualTo("AB");
    }

    @Test
    void gcdOfStringsExample3() {
        assertThat(GreatestCommonDivisorOfStrings.gcdOfStrings("LEET", "CODE")).isEqualTo("");
    }

    @Test
    void gcdOfStringsExample4() {
        assertThat(GreatestCommonDivisorOfStrings.gcdOfStrings("AB", "AB")).isEqualTo("AB");
    }

    @Test
    void gcdOfStringsExample5() {
        assertThat(GreatestCommonDivisorOfStrings.gcdOfStrings("AAAAA", "AA")).isEqualTo("A");
    }

    @Test
    void gcdOfStringsExample6() {
        assertThat(GreatestCommonDivisorOfStrings.gcdOfStrings("AAAAAA", "AA")).isEqualTo("AA");
    }
}