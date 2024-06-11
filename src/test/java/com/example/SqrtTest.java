package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SqrtTest {

    @Test
    void mySqrtExample1() {
        assertThat(Sqrt.mySqrt(4)).isEqualTo(2);
    }

    @Test
    void mySqrtExample2() {
        assertThat(Sqrt.mySqrt(8)).isEqualTo(2);
    }

    @Test
    void mySqrtExample3() {
        assertThat(Sqrt.mySqrt(0)).isEqualTo(0);
    }

    @Test
    void mySqrtExample4() {
        assertThat(Sqrt.mySqrt(2147395599)).isEqualTo(46339);
    }
}