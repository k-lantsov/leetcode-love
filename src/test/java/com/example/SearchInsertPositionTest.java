package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPositionTest {

    @Test
    void searchInsertExample1() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    }

    @Test
    void searchInsertExample2() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    }

    @Test
    void searchInsertExample3() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }
    @Test
    void searchInsertExample4() {
        assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
    }
}