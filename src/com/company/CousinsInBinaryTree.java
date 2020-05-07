package com.company;

public class CousinsInBinaryTree {

    static TreeNode parentX = null, parentY = null;
    static int levelX = -1, levelY = -1;

    // Accepted
    public static void main(String[] args) {
        parentX = parentY = null;
        levelX = levelY = -1;
        TreeNode root = new TreeNode(1, null, null);
        root.left = new TreeNode(2, null, null);
        root.right = new TreeNode(3, null, null);
        root.left.right = new TreeNode(4, null, null);
        root.right.right = new TreeNode(5, null, null);
        int x = 5 , y = 4;
        System.out.println(isCousins(root,x,y));
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        boolean flag = false;
        parentX = parentY = null;
        levelX = levelY = -1;

        preOrderX(root,x,y,0);
        System.out.println(levelX + " " + levelY);
        if (levelX == levelY) {
            if (parentY != null && parentX != null && (parentX != parentY)) {
                flag = true;
            }
        }
        else {
            flag = false;
        }
        return flag;
    }

    public static void preOrderX(TreeNode root, int valueX, int valueY, int level) {
        if (root == null) { return; }
        System.out.println(root.val + " " + level);
        if (root.left != null) {
            if (root.left.val == valueX) {
                parentX = root;
                levelX = level  + 1 ;
            }
            else if (root.left.val == valueY) {
                parentY = root;
                levelY = level  + 1 ;
            }
        }

        if (root.right != null) {
            if (root.right.val == valueX) {
                parentX = root;
                levelX = level + 1;
            } else if (root.right.val == valueY) {
                parentY = root;
                levelY = level + 1;
            }
        }
        preOrderX(root.left,valueX,valueY,level + 1);
        preOrderX(root.right, valueX,valueY, level + 1);
    }

}
