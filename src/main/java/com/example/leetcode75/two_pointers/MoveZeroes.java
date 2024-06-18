package com.example.leetcode75.two_pointers;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l++;
            }
        }
        return nums;
    }
}
