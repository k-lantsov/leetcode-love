package com.example.leetcode75.sliding_window;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double average = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            average = Math.max(average, sum / k);
        }
        return average;
    }
}
