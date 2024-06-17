package com.example.leetcode75;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCompressionTest {

    @Test
    void compressExample1() {
        assertThat(StringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(6);
    }

    @Test
    void compressExample2() {
        assertThat(StringCompression.compress(new char[]{'a'})).isEqualTo(1);
    }

    @Test
    void compressExample3() {
        assertThat(StringCompression.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}))
                .isEqualTo(4);
    }
}