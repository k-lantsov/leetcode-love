package com.example.leetcode75.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {

    private int maxLevel = 0;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        bfc(root, ans, 0);
        return ans;
    }

    private void bfc(TreeNode node, List<Integer> list, int prevLevel) {
        if (node == null) {
            return;
        }
        int currLevel = prevLevel + 1;
        if (currLevel > maxLevel) {
            list.add(node.val);
            maxLevel = currLevel;
        }
        bfc(node.right, list, currLevel);
        bfc(node.left, list, currLevel);
    }
}
