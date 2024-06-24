package com.example.leetcode75.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecodeStringTest {

    @Test
    void decodeStringExample1() {
        assertThat(DecodeString.decodeString("3[a]2[bc]")).isEqualTo("aaabcbc");
    }

    @Test
    void decodeStringExample2() {
        assertThat(DecodeString.decodeString("3[a2[c]]")).isEqualTo("accaccacc");
    }

    @Test
    void decodeStringExample3() {
        assertThat(DecodeString.decodeString("2[abc]3[cd]ef")).isEqualTo("abcabccdcdcdef");
    }
}