package com.example.leetcode75.hashmap_hashset;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DetermineIfTwoStringCloseTest {

    @Test
    void closeStringsExample1() {
        assertThat(DetermineIfTwoStringClose.closeStrings("abc", "bca")).isEqualTo(true);
    }

    @Test
    void closeStringsExample2() {
        assertThat(DetermineIfTwoStringClose.closeStrings("a", "aa")).isEqualTo(false);
    }

    @Test
    void closeStringsExample3() {
        assertThat(DetermineIfTwoStringClose.closeStrings("cabbba", "abbccc")).isEqualTo(true);
    }

    @Test
    void closeStringsExample4() {
        assertThat(DetermineIfTwoStringClose.closeStrings("abbzzca", "babzzcz")).isEqualTo(false);
    }
}