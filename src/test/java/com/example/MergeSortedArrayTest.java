package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArrayTest {

    @Test
    void mergeExample1() {
        assertThat(MergeSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)).isEqualTo(new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    void mergeExample2() {
        assertThat(MergeSortedArray.merge(new int[]{1}, 1, new int[]{}, 0)).isEqualTo(new int[]{1});
    }

    @Test
    void mergeExample3() {
        assertThat(MergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1)).isEqualTo(new int[]{1});
    }
}