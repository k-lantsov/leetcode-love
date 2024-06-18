package com.example.leetcode75.two_pointers;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        int sLength = s.length();
        int tLength = t.length();
        while (sp < sLength && tp < tLength){
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return sp == sLength;
    }
}
