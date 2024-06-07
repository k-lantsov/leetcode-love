package com.example;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> elemToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            elemToIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int firstElem = nums[i];
            if (elemToIndex.containsKey(target - firstElem) && elemToIndex.get(target - firstElem) != i) {
                int secondElemIndex = elemToIndex.get(target - firstElem);
                return new int[]{i, secondElemIndex};
            }
        }
        return new int[]{-1, -1};
    }
}