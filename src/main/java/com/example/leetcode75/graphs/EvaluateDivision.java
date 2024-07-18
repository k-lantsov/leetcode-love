package com.example.leetcode75.graphs;

import java.util.*;

public class EvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = makeGraph(equations, values);

        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String c = queries.get(i).get(0);
            String d = queries.get(i).get(1);
            ans[i] = dfs(c, d, new HashSet<>(), graph);
        }
        return ans;
    }

    private Map<String, Map<String, Double>> makeGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        String a;
        String b;

        for (int i = 0; i < equations.size(); i++) {
            a = equations.get(i).get(0);
            b = equations.get(i).get(1);

            graph.putIfAbsent(a, new HashMap<>());
            graph.get(a).put(b, values[i]);

            graph.putIfAbsent(b, new HashMap<>());
            graph.get(b).put(a, 1 / values[i]);
        }

        return graph;
    }

    public double dfs(String c, String d, Set<String> visited, Map<String, Map<String, Double>> graph) {
        if (!graph.containsKey(c)) {
            return -1.0;
        }

        if (graph.get(c).containsKey(d)) {
            return graph.get(c).get(d);
        }

        visited.add(c);

        for (Map.Entry<String, Double> nbr : graph.get(c).entrySet()) {
            if (!visited.contains(nbr.getKey())) {
                double weight = dfs(nbr.getKey(), d, visited, graph);
                if (weight != -1.0) {
                    return nbr.getValue() * weight;
                }
            }
        }
        return -1.0;
    }
}
