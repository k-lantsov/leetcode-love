package com.example;

public class LengthOfLastWord {

    private static final char SPACE = ' ';

    public static int lengthOfLastWord(String s) {
        String stripped = s.stripTrailing();
        int i = 0;
        int j = stripped.length() - 1;
        while (j >= 0 && SPACE != stripped.charAt(j)) {
            j--;
            i++;
        }
        return i;
    }
}
