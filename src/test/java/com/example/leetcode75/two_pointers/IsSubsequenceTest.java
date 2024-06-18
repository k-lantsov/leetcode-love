package com.example.leetcode75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsSubsequenceTest {

    @Test
    void isSubsequenceExample1() {
        assertThat(IsSubsequence.isSubsequence("abc", "ahbgdc")).isEqualTo(true);
    }

    @Test
    void isSubsequenceExample2() {
        assertThat(IsSubsequence.isSubsequence("axc", "ahbgdc")).isEqualTo(false);
    }

    @Test
    void isSubsequenceExample3() {
        assertThat(IsSubsequence.isSubsequence("", "")).isEqualTo(true);
    }

    @Test
    void isSubsequenceExample4() {
        assertThat(IsSubsequence.isSubsequence("", "abc")).isEqualTo(true);
    }

    @Test
    void isSubsequenceExample5() {
        assertThat(IsSubsequence.isSubsequence("abc", "")).isEqualTo(false);
    }
}