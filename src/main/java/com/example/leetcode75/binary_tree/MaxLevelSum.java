package com.example.leetcode75.binary_tree;


import java.util.HashMap;
import java.util.Map;

public class MaxLevelSum {

    public int maxLevelSum(TreeNode root) {
        Map<Integer, Long> levelSums = new HashMap<>();
        bfs(root, levelSums, 1);
        long maxLevelSum = Long.MIN_VALUE;
        int levelNumber = 1;
        for (Map.Entry<Integer, Long> entry: levelSums.entrySet()) {
            if (entry.getValue() > maxLevelSum) {
                maxLevelSum = entry.getValue();
                levelNumber = entry.getKey();
            }
        }
        return levelNumber;
    }

    private void bfs(TreeNode node, Map<Integer, Long> levelSums, int level) {
        if (node == null) {
            return;
        }
        Long prevLevelSum = levelSums.getOrDefault(level, 0L);
        levelSums.put(level, prevLevelSum + node.val);
        bfs(node.left, levelSums, level + 1);
        bfs(node.right, levelSums, level + 1);
    }
}
