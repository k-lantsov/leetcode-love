package com.example;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && isPair(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

    private static boolean isPair(char last, char current) {
        return (last == '(' && current == ')') ||
                (last == '[' && current == ']') ||
                (last == '{' && current == '}');
    }
}
