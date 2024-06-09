package com.example;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return binarySearch(low, high, nums, target);
    }

    private static int binarySearch(int low, int high, int[] nums, int target) {
        if (low > high) {
            return low;
        }

        int middle = low + (high - low) / 2;
        if (nums[middle] == target) {
            return middle;
        }

        return nums[middle] > target ?
                binarySearch(low, middle - 1, nums, target) :
                binarySearch(middle + 1, high, nums, target);
    }
}
