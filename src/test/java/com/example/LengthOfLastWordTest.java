package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWordExample1() {
        assertThat(LengthOfLastWord.lengthOfLastWord("Hello World")).isEqualTo(5);
    }

    @Test
    void lengthOfLastWordExample2() {
        assertThat(LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
    }

    @Test
    void lengthOfLastWordExample3() {
        assertThat(LengthOfLastWord.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
    }

    @Test
    void lengthOfLastWordExample4() {
        assertThat(LengthOfLastWord.lengthOfLastWord("haha")).isEqualTo(4);
    }

    @Test
    void lengthOfLastWordExample5() {
        assertThat(LengthOfLastWord.lengthOfLastWord("")).isEqualTo(0);
    }
}