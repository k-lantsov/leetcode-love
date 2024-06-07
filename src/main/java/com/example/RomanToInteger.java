package com.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int ans = 0;
        int next = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanToInt.get(s.charAt(i));
            if (i < s.length() - 1 && current < next) {
                ans -= current;
            } else {
                ans += current;
            }
            next = current;
        }
        return ans;
    }
}
