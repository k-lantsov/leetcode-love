package com.example.leetcode75.hashmap_hashset;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

    public static int equalPairs1(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        Map<String, Integer> row2Count = new HashMap<>();
        Map<String, Integer> col2Count = new HashMap<>();

        for (int[] row : grid) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(row[j]);
                if (j != n - 1) {
                    sb.append(" ");
                }
            }
            row2Count.merge(sb.toString(), 1, Integer::sum);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[j][i]);
                if (j != n - 1) {
                    sb.append(" ");
                }
            }
            col2Count.merge(sb.toString(), 1, Integer::sum);
        }

        for (String s : row2Count.keySet()) {
            if (col2Count.containsKey(s)) {
                ans += row2Count.get(s) * col2Count.get(s);
            }
        }
        return ans;
    }

    public static int equalPairs2(int[][] grid) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for (int[] row : grid) {
            int hash = getRowHash(row);
            hm.merge(hash, 1, Integer::sum);
        }

        for (int i = 0; i < grid.length; i++) {
            int hash = getColHash(grid, i);
            count += hm.getOrDefault(hash, 0);
        }

        return count;
    }

    private static int getRowHash(int[] row) {
        int hash = 0;
        for (int num : row) {
            hash = num + (hash * 7);
        }
        return hash;
    }

    private static int getColHash(int[][] grid, int col) {
        int hash = 0;
        for (int[] num : grid) {
            hash = num[col] + (hash * 7);
        }
        return hash;
    }
}
