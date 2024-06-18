package com.example.leetcode75.array_string;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('o');
        vowels.add('O');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('u');
        vowels.add('U');

        char[] chars = s.toCharArray();

        int j = s.length() - 1;
        for (int i = 0; i < j; i++) {
            char ch = chars[i];
            if (vowels.contains(ch)) {
                boolean founded = false;
                while (j >= 0 && !founded) {
                    char reversedCh = chars[j];
                    if (vowels.contains(reversedCh)) {
                        chars[i] = reversedCh;
                        chars[j] = ch;
                        founded = true;
                    }
                    j--;
                }
            }
        }
        return String.valueOf(chars);
    }
}
