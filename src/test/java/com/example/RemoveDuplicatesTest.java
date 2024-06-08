package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicatesExample1() {
        assertThat(RemoveDuplicates.removeDuplicates(new int[]{1, 1, 2})).isEqualTo(2);
    }

    @Test
    void removeDuplicatesExample2() {
        assertThat(RemoveDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})).isEqualTo(5);
    }

    @Test
    void removeDuplicatesExample3() {
        assertThat(RemoveDuplicates.removeDuplicates(new int[]{1, 1, 1, 1})).isEqualTo(1);
    }
}