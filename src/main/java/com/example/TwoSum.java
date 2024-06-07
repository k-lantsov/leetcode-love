package com.example;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> elemToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (elemToIndex.containsKey(diff)) {
                return new int[]{elemToIndex.get(diff), i};
            }
            elemToIndex.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}