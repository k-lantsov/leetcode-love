package com.example.leetcode75.stack;

import java.util.Stack;

public class DecodeString {

    // 3[a2[c]] = accaccacc
    public static String decodeString(String s) {
        Stack<Integer> repeat = new Stack<>();
        Stack<StringBuilder> content = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                n = n * 10 + (ch - '0');
            } else if (ch == '[') {
                repeat.push(n);
                content.push(sb);
                sb = new StringBuilder();
                n = 0;
            } else if (ch == ']') {
                int k = repeat.pop();
                StringBuilder tmp = sb;
                sb = content.pop();
                while (k > 0) {
                    sb.append(tmp);
                    k--;
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
