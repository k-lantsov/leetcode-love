package com.example.leetcode75;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInStringTest {

    @Test
    void reverseWordsExample1() {
        assertThat(ReverseWordsInString.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
    }

    @Test
    void reverseWordsExample2() {
        assertThat(ReverseWordsInString.reverseWords("  hello world  ")).isEqualTo("world hello");
    }

    @Test
    void reverseWordsExample3() {
        assertThat(ReverseWordsInString.reverseWords("a good   example")).isEqualTo("example good a");
    }}