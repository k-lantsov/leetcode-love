package com.example.leetcode75.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReorderRoutesTest {

    private ReorderRoutes reorderRoutes;

    @BeforeEach
    public void prepare() {
        reorderRoutes = new ReorderRoutes();
    }

    @Test
    void minReorderExample1() {
        assertThat(reorderRoutes.minReorder(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}})).isEqualTo(3);
    }

    @Test
    void minReorderExample2() {
        assertThat(reorderRoutes.minReorder(3, new int[][]{{1, 0}, {2, 0}})).isEqualTo(0);
    }

    @Test
    void minReorderExample3() {
        assertThat(reorderRoutes.minReorder(3, new int[][]{{1, 0}, {0, 2}})).isEqualTo(1);
    }

}