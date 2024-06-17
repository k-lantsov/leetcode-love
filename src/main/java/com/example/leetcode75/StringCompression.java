package com.example.leetcode75;

public class StringCompression {

    public static int compress(char[] chars) {
        int count = 1;
        char prev = chars[0];
        int j = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
            } else {
                j = replaceChars(chars, j, prev, count);
                prev = chars[i];
                count = 1;
            }
        }
        j = replaceChars(chars, j, prev, count);

        return j;
    }

    private static int replaceChars(char[] chars, int j, char prev, int count) {
        chars[j] = prev;
        j++;
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (char c: countStr.toCharArray()) {
                chars[j] = c;
                j++;
            }
        }
        return j;
    }
}
