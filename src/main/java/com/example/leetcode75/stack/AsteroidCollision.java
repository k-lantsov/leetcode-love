package com.example.leetcode75.stack;

import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(a);
                }

                if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }
}
