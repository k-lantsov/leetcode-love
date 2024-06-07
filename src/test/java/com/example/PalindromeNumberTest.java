package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    @Test
    void isPalindromeExample1() {
        assertThat(PalindromeNumber.isPalindrome(121)).isEqualTo(true);
    }

    @Test
    void isPalindromeExample2() {
        assertThat(PalindromeNumber.isPalindrome(-121)).isEqualTo(false);
    }

    @Test
    void isPalindromeExample3() {
        assertThat(PalindromeNumber.isPalindrome(0)).isEqualTo(true);
    }

    @Test
    void isPalindromeExample4() {
        assertThat(PalindromeNumber.isPalindrome(10)).isEqualTo(false);
    }
}