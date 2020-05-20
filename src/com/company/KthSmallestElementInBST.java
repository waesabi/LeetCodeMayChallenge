package com.company;

/*
    Problem Link - https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    Accepted
 */
public class KthSmallestElementInBST {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 3;
        kthSmallest(root,k);
    }

    public static int ans = -1;
    public static int kth = 0;
    public static int kthSmallest(TreeNode root, int k) {
        kth = 0;
        ans = -1;
        inOrder(root,k);
        return ans;
    }

    public static void inOrder(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        inOrder(root.left,k);
        kth++;
        if (kth == k) {
            ans = root.val;
            System.out.println("Found: " + root.val);
            return ;
        }
        inOrder(root.right,k);

    }
}
