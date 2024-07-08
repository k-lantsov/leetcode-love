package com.example.leetcode75.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        dfs(rooms, visited, 0);
        return rooms.size() == visited.size();
    }

    private void dfs(List<List<Integer>> rooms, Set<Integer> visited, int room) {
        List<Integer> keys = rooms.get(room);
        for (int key: keys) {
            if (!visited.contains(key)) {
                visited.add(key);
                dfs(rooms, visited, key);
            }
        }
    }
}
