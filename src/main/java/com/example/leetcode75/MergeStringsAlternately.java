package com.example.leetcode75;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder ans = new StringBuilder();

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                ans.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                ans.append(word2.charAt(i));
            }
            i++;
        }

        return ans.toString();
    }
}
