package com.example.leetcode75.sliding_window;

public class LongestSubarrayAfterDeletingElement {

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int right;
        int k = 0;
        int ans = 0;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k++;
            }
            while (k > 1) {
                if (nums[left] == 0) {
                    k--;
                }
                left++;
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
