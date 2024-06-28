package com.example.leetcode75.binary_tree;

import java.util.HashMap;
import java.util.Map;

public class PathSum {

    private static Map<Long, Integer> prefixSumToTimes;
    private static int count;

    public static int pathSum(TreeNode root, int targetSum) {
        count = 0;
        prefixSumToTimes = new HashMap<>();
        dfs(root, 0, targetSum);
        return count;
    }

    private static void dfs(TreeNode root, long prefixSum, int targetSum) {
        if (root == null) {
            return;
        }

        prefixSum += root.val;
        if (prefixSumToTimes.containsKey(prefixSum - targetSum)) {
            count += prefixSumToTimes.get(prefixSum - targetSum);
        }
        if (targetSum == prefixSum) {
            count++;
        }
        prefixSumToTimes.merge(prefixSum, 1, Integer::sum);
        dfs(root.left, prefixSum, targetSum);
        dfs(root.right, prefixSum, targetSum);
        prefixSumToTimes.merge(prefixSum, -1,Integer::sum);
    }
}
