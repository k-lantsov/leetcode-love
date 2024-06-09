package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindIndexOfFirstOccurrenceInStrTest {

    @Test
    void strStrExample1() {
        assertThat(FindIndexOfFirstOccurrenceInStr.strStr("sadbutsad", "sad")).isEqualTo(0);
    }

    @Test
    void strStrExample2() {
        assertThat(FindIndexOfFirstOccurrenceInStr.strStr("butsad", "sad")).isEqualTo(3);
    }

    @Test
    void strStrExample3() {
        assertThat(FindIndexOfFirstOccurrenceInStr.strStr("leetcode", "leeto")).isEqualTo(-1);
    }
}