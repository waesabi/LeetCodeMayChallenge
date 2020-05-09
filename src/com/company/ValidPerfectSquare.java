package com.company;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(808201));
        System.out.println(isPerfectSquare(808201));;
    }

    // Accepted - Always prefer loop instead of recursion.
    public static boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) { return true; }
        return isSquare(0,num / 2, num);
    }

    public static boolean isSquare(int left, int right, long num) {
        if (left > right) { return false; }
        int mid = left + (right - left) / 2;
        if ((long)mid * mid == num) {
            return true;
        }
        else if ((long)mid * mid < num) {
            return isSquare(mid + 1, right, num);
        }
        else {
            return isSquare(left, mid - 1, num);
        }
    }
}
