package com.example.leetcode75.array_string;

public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int smallest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > middle) {
                return true;
            }
            if (num <= smallest) {
                smallest = num;
            } else {
                middle = num;
            }
        }
        return false;
    }
}
