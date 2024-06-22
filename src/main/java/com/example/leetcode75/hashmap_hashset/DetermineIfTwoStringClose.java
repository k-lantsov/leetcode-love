package com.example.leetcode75.hashmap_hashset;

import java.util.*;

public class DetermineIfTwoStringClose {

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        if (word1.equals(word2)) {
            return true;
        }

        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            word1Map.merge(c1, 1, Integer::sum);

            char c2 = word2.charAt(i);
            word2Map.merge(c2, 1, Integer::sum);
        }

        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }

        List<Integer> frequencies1 = new ArrayList<>(word1Map.values());
        List<Integer> frequencies2 = new ArrayList<>(word2Map.values());
        Collections.sort(frequencies1);
        Collections.sort(frequencies2);
        return frequencies1.equals(frequencies2);
    }
}
