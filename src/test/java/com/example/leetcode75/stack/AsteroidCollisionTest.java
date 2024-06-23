package com.example.leetcode75.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AsteroidCollisionTest {

    @Test
    void asteroidCollisionExample1() {
        assertThat(AsteroidCollision.asteroidCollision(new int[]{5, 10, -5})).isEqualTo(new int[]{5, 10});
    }

    @Test
    void asteroidCollisionExample2() {
        assertThat(AsteroidCollision.asteroidCollision(new int[]{8, -8})).isEqualTo(new int[]{});
    }

    @Test
    void asteroidCollisionExample3() {
        assertThat(AsteroidCollision.asteroidCollision(new int[]{10, 2, -5})).isEqualTo(new int[]{10});
    }

    @Test
    void asteroidCollisionExample4() {
        assertThat(AsteroidCollision.asteroidCollision(new int[]{-2, -1, 1, 2})).isEqualTo(new int[]{-2, -1, 1, 2});
    }
}