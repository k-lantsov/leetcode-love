package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefixExample1() {
        assertThat(LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
    }

    @Test
    void longestCommonPrefixExample2() {
        assertThat(LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
    }

    @Test
    void longestCommonPrefixExample3() {
        assertThat(LongestCommonPrefix.longestCommonPrefix(new String[]{"preheat", "oven", "prehistoric"})).isEqualTo("");
    }
}