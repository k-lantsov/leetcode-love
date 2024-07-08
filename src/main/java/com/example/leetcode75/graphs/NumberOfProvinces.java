package com.example.leetcode75.graphs;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                provinces++;
            }
        }
        return provinces;
    }

    private void dfs(int i, int[][] isConnected, boolean[] visited) {
        for (int j = 0; j < isConnected[i].length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(j, isConnected, visited);
            }
        }
    }
}
