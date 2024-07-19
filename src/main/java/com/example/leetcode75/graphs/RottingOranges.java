package com.example.leetcode75.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    private record Pair(int row, int col) {
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Pair> queue = new ArrayDeque<>();
        int freshOranges = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j));
                    visited[i][j] = true;
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0) {
            return 0;
        }

        int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean hasRotten = false;
            for (int i = 0; i < size; i++) {
                Pair poll = queue.poll();
                int row = poll.row;
                int col = poll.col;

                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                            && !visited[newRow][newCol]
                            && grid[newRow][newCol] == 1) {
                        visited[newRow][newCol] = true;
                        queue.offer(new Pair(newRow, newCol));
                        freshOranges--;
                        hasRotten = true;
                    }
                }
            }

            if (hasRotten) {
                minutes++;
            }
        }

        return freshOranges == 0 ? minutes : -1;
    }
}
