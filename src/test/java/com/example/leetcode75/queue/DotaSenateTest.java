package com.example.leetcode75.queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DotaSenateTest {

    @Test
    void predictPartyVictoryExample1() {
        assertThat(DotaSenate.predictPartyVictory("RD")).isEqualTo("Radiant");
    }

    @Test
    void predictPartyVictoryExample2() {
        assertThat(DotaSenate.predictPartyVictory("RDD")).isEqualTo("Dire");
    }

    @Test
    void predictPartyVictoryExample3() {
        assertThat(DotaSenate.predictPartyVictory("DDRRR")).isEqualTo("Dire");
    }
}