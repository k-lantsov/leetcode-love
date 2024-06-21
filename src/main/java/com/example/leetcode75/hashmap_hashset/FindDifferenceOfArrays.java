package com.example.leetcode75.hashmap_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for (Integer num : set1) {
            if (!set2.contains(num)) {
                ans1.add(num);
            }
        }
        for (Integer num : set2) {
            if (!set1.contains(num)) {
                ans2.add(num);
            }
        }

        return List.of(ans1, ans2);
    }
}
