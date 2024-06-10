package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddBinaryTest {

    @Test
    void addBinaryExample1() {
        assertThat(AddBinary.addBinary("11", "1")).isEqualTo("100");
    }

    @Test
    void addBinaryExample2() {
        assertThat(AddBinary.addBinary("1010", "1011")).isEqualTo("10101");
    }

    @Test
    void addBinaryExample3() {
        assertThat(AddBinary.addBinary("110010", "10111")).isEqualTo("1001001");
    }
}