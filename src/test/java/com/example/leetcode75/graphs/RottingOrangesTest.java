package com.example.leetcode75.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RottingOrangesTest {

    private RottingOranges rottingOranges;

    @BeforeEach
    public void prepare() {
        rottingOranges = new RottingOranges();
    }

    @Test
    void orangesRottingExample1() {
        assertThat(rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}})).isEqualTo(4);
    }
}