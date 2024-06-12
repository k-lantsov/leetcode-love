package com.example;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int prev = 1;
        int curr = 1;
        // in each iteration it updates prev and curr by shifting their values.
        // curr becomes the sum of the previous two values, and prev stores the previous value of curr.
        for (int i = 2; i <= n; i++) {
            curr = prev + curr;
            prev = curr - prev;
        }
        return curr;
    }
}
