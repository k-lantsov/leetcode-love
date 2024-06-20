package com.example.leetcode75.prefix_sum;

public class FindHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int previousAltitude = 0;
        int maxAltitude = 0;
        for (int elem : gain) {
            int currentAltitude = previousAltitude + elem;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
            previousAltitude = currentAltitude;
        }
        return maxAltitude;
    }
}
