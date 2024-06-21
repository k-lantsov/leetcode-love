package com.example.leetcode75.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> num2Count = new HashMap<>();
        for (int num : arr) {
            Integer count = 0;
            if (num2Count.containsKey(num)) {
                count = num2Count.get(num);
            }
            num2Count.put(num, count + 1);
        }
        Set<Integer> counts = new HashSet<>(num2Count.values());
        return counts.size() == num2Count.size();
    }
}
