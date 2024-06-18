package com.example.leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        List<Boolean> ans = new ArrayList<>();
        for (int elem : candies) {
            ans.add(elem + extraCandies >= maxCandies);
        }
        return ans;
    }
}
