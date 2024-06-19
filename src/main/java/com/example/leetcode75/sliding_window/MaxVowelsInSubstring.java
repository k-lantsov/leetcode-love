package com.example.leetcode75.sliding_window;

public class MaxVowelsInSubstring {

    public static int maxVowels(String s, int k) {
        if (s.length() < k) {
            return 0;
        }

        int vowelsCount = 0;
        for (int i = 0; i < k; i++) {
            char current = s.charAt(i);
            if (isVowel(current)) {
                vowelsCount++;
            }
        }

        int maxVowelsCount = vowelsCount;
        int i = k;
        while (i < s.length() && maxVowelsCount < k) {
            char previousChar = s.charAt(i - k);
            if (isVowel(previousChar)) {
                vowelsCount--;
            }
            char currentLastChar = s.charAt(i);
            if (isVowel(currentLastChar)) {
                vowelsCount++;
            }
            maxVowelsCount = Math.max(maxVowelsCount, vowelsCount);
            i++;
        }
        return maxVowelsCount;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c=='o' || c == 'e' || c == 'u';
    }
}
