package com.example.leetcode75.hashmap_hashset;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FindDifferenceOfArraysTest {

    @Test
    void findDifferenceExample1() {
        assertThat(FindDifferenceOfArrays.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}))
                .isEqualTo(List.of(List.of(1, 3), List.of(4, 6)));
    }

    @Test
    void findDifferenceExample2() {
        assertThat(FindDifferenceOfArrays.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}))
                .isEqualTo(List.of(List.of(3), Collections.EMPTY_LIST));
    }
}