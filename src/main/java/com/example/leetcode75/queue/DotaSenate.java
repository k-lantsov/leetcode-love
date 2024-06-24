package com.example.leetcode75.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DotaSenate {

    public static String predictPartyVictory(String senate) {
        int n = senate.length();
        Deque<Integer> rq = new ArrayDeque<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            char senator = senate.charAt(i);
            if (senator == 'R') {
                rq.add(i);
            } else {
                dq.add(i);
            }
        }

        while (!rq.isEmpty() && !dq.isEmpty()) {
            Integer r = rq.poll();
            Integer d = dq.poll();
            if (r < d) {
                rq.add(r + n);
            } else {
                dq.add(d + n);
            }
        }

        if (rq.isEmpty()) {
            return "Dire";
        }
        return "Radiant";
    }
}
