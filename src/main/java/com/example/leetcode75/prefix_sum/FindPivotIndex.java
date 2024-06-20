package com.example.leetcode75.prefix_sum;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int length = nums.length;
        int[] leftSum = new int[length];
        int[] rightSum = new int[length];

        for (int i = 1; i < length; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
            rightSum[length - i - 1] = nums[length - i] + rightSum[length - i];
        }

        int ans = -1;
        int i = 0;
        while (ans == -1 && i < length) {
            if (leftSum[i] == rightSum[i]) {
                ans = i;
            }
            i++;
        }

        return ans;
    }
}
