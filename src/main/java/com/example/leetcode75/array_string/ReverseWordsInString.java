package com.example.leetcode75.array_string;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        int i = s.length() - 1;
        int j;
        StringBuilder sb = new StringBuilder();

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i + 1, j + 1);
            sb.append(word).append(" ");
        }

        return sb.toString().strip();
    }
}
