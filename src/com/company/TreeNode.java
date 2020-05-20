package com.company;

public class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode() { }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int i) {
        this.val = i;
    }
}
