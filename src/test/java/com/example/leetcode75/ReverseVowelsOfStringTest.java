package com.example.leetcode75;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseVowelsOfStringTest {

    @Test
    void reverseVowelsExample1() {
        assertThat(ReverseVowelsOfString.reverseVowels("hello")).isEqualTo("holle");
    }

    @Test
    void reverseVowelsExample2() {
        assertThat(ReverseVowelsOfString.reverseVowels("leetcode")).isEqualTo("leotcede");
    }
}