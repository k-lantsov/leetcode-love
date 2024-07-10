package com.example.leetcode75.graphs;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutes {

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph = makeGraph(n, connections);
        return dfs(graph, new boolean[n], 0);
    }

    private List<List<Integer>> makeGraph(int n, int[][] connections) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] c : connections) {
            graph.get(c[0]).add(c[1]);
            graph.get(c[1]).add(-c[0]);
        }
        return graph;
    }

    private int dfs(List<List<Integer>> graph, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        for (Integer elem : graph.get(from)) {
            int to = elem < 0 ? -elem : elem;
            if (!visited[to])
                change += dfs(graph, visited, to) + (elem > 0 ? 1 : 0);
        }
        return change;
    }
}
