package com.example.leetcode75.queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecentCounterTest {

    @Test
    void pingExample1() {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(0);
        recentCounter.ping(1);
        recentCounter.ping(100);
        recentCounter.ping(3001);
        assertThat(recentCounter.ping(3002)).isEqualTo(3);
    }
}