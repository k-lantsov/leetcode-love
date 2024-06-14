package com.example.leetcode75;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeStringsAlternatelyTest {

    @Test
    void mergeAlternatelyExample1() {
        assertThat(MergeStringsAlternately.mergeAlternately("abc", "pqr")).isEqualTo("apbqcr");
    }

    @Test
    void mergeAlternatelyExample2() {
        assertThat(MergeStringsAlternately.mergeAlternately("ab", "pqrs")).isEqualTo("apbqrs");
    }

    @Test
    void mergeAlternatelyExample3() {
        assertThat(MergeStringsAlternately.mergeAlternately("abcd", "pq")).isEqualTo("apbqcd");
    }

    @Test
    void mergeAlternatelyExample4() {
        assertThat(MergeStringsAlternately.mergeAlternately("cdf", "a")).isEqualTo("cadf");
    }
}