package com.example.leetcode75.array_string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KidsWithCandiesTest {

    @Test
    void kidsWithCandiesExample1() {
        assertThat(KidsWithCandies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3))
                .isEqualTo(List.of(true, true, true, false, true));
    }

    @Test
    void kidsWithCandiesExample2() {
        assertThat(KidsWithCandies.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1))
                .isEqualTo(List.of(true, false, false, false, false));
    }

    @Test
    void kidsWithCandiesExample3() {
        assertThat(KidsWithCandies.kidsWithCandies(new int[]{12, 1, 12}, 10))
                .isEqualTo(List.of(true, false, true));
    }

    @Test
    void kidsWithCandiesExample4() {
        assertThat(KidsWithCandies.kidsWithCandies(new int[]{12}, 1))
                .isEqualTo(List.of(true));
    }
}