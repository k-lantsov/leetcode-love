package com.example.leetcode75.hashmap_hashset;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueNumberOfOccurrencesTest {

    @Test
    void uniqueOccurrencesExample1() {
        assertThat(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3})).isEqualTo(true);
    }

    @Test
    void uniqueOccurrencesExample2() {
        assertThat(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1, 2})).isEqualTo(false);
    }

    @Test
    void uniqueOccurrencesExample3() {
        assertThat(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})).isEqualTo(true);
    }
}