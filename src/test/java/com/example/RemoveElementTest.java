package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveElementTest {

    @Test
    void removeElementExample1() {
        assertThat(RemoveElement.removeElement(new int[]{3, 2, 2, 3}, 3)).isEqualTo(2);
    }

    @Test
    void removeElementExample2() {
        assertThat(RemoveElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)).isEqualTo(5);
    }

    @Test
    void removeElementExample3() {
        assertThat(RemoveElement.removeElement(new int[]{0, 0, 0}, 2)).isEqualTo(3);
    }

    @Test
    void removeElementExample4() {
        assertThat(RemoveElement.removeElement(new int[]{0, 0, 0}, 0)).isEqualTo(0);
    }

    @Test
    void removeElementExample5() {
        assertThat(RemoveElement.removeElement(new int[]{2}, 3)).isEqualTo(1);
    }
}