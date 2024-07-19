package com.example.leetcode75.graphs;

import java.util.ArrayDeque;

public class NearestExit {

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int columns = maze[0].length;

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int steps = 0;

        while (!queue.isEmpty()) {
            steps++;
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                int[] current = queue.poll();
                for (int[] direction : directions) {
                    int x = current[0] + direction[0];
                    int y = current[1] + direction[1];
                    if (x < 0 || x >= rows || y < 0 || y >= columns) {
                        continue;
                    }
                    if (maze[x][y] == '+') {
                        continue;
                    }
                    if (x == 0 || x == rows - 1 || y == 0 || y == columns - 1) {
                        return steps;
                    }
                    maze[x][y] = '+';
                    queue.offer(new int[]{x, y});
                }
            }
        }

        return  -1;
    }
}
