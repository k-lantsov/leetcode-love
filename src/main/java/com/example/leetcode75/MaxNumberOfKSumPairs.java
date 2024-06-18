package com.example.leetcode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> numsToCount = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            int diff = k - num;
            if (diff <= 0) {
                continue;
            }
            if (numsToCount.containsKey(diff) && numsToCount.get(diff) > 0) {
                ans++;
                numsToCount.put(diff, numsToCount.get(diff) - 1);
                continue;
            }
            Integer numCount = numsToCount.get(num);
            numsToCount.put(num, numCount == null ? 1 : numCount + 1);
        }
        return ans;
    }

    public static int maxOperations2Pointers(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                ans++;
                left++;
                right--;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }

        return ans;
    }
}
