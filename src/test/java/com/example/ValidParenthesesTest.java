package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    @Test
    void isValidExample1() {
        assertThat(ValidParentheses.isValid("()")).isEqualTo(true);
    }

    @Test
    void isValidExample2() {
        assertThat(ValidParentheses.isValid("()[]{}")).isEqualTo(true);
    }

    @Test
    void isValidExample3() {
        assertThat(ValidParentheses.isValid("(]")).isEqualTo(false);
    }

    @Test
    void isValidExample4() {
        assertThat(ValidParentheses.isValid("")).isEqualTo(true);
    }

    @Test
    void isValidExample5() {
        assertThat(ValidParentheses.isValid("([{{}}])")).isEqualTo(true);
    }

    @Test
    void isValidExample6() {
        assertThat(ValidParentheses.isValid("([{{}})")).isEqualTo(false);
    }

    @Test
    void isValidExample7() {
        assertThat(ValidParentheses.isValid("(")).isEqualTo(false);
    }

    @Test
    void isValidExample8() {
        assertThat(ValidParentheses.isValid(")")).isEqualTo(false);
    }
}