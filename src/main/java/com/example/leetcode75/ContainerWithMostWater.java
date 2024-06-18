package com.example.leetcode75;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            if (leftHeight > rightHeight) {
                maxArea = Math.max(rightHeight * (right - left), maxArea);
                right--;
            } else {
                maxArea = Math.max(leftHeight * (right - left), maxArea);
                left++;
            }
        }
        return maxArea;
    }
}
