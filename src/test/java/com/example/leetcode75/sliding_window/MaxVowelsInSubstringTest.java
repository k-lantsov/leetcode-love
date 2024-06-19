package com.example.leetcode75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxVowelsInSubstringTest {

    @Test
    void maxVowelsExample1() {
        assertThat(MaxVowelsInSubstring.maxVowels("abciiidef", 3)).isEqualTo(3);
    }

    @Test
    void maxVowelsExample2() {
        assertThat(MaxVowelsInSubstring.maxVowels("aeiou", 2)).isEqualTo(2);
    }

    @Test
    void maxVowelsExample3() {
        assertThat(MaxVowelsInSubstring.maxVowels("leetcode", 3)).isEqualTo(2);
    }
}