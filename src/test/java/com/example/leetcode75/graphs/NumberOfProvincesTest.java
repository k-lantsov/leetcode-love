package com.example.leetcode75.graphs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfProvincesTest {

    @Test
    void findCircleNumExample1() {
        NumberOfProvinces numberOfProvinces = new NumberOfProvinces();
        assertThat(numberOfProvinces.findCircleNum(new int[][]{{1, 1 ,0}, {1, 1, 1}, {0, 1, 1}})).isEqualTo(1);
    }

    @Test
    void findCircleNumExample2() {
        NumberOfProvinces numberOfProvinces = new NumberOfProvinces();
        assertThat(numberOfProvinces.findCircleNum(new int[][]{{1, 1 ,0}, {1, 1, 0}, {0, 0, 1}})).isEqualTo(2);
    }
}