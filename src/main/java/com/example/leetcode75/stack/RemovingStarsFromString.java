package com.example.leetcode75.stack;

import java.util.Stack;

public class RemovingStarsFromString {

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for (Character c : stack) {
            ans.append(c);
        }
        return ans.toString();
    }
}
