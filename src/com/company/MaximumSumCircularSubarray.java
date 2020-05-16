package com.company;

import java.util.ArrayList;

/*
    Problem Link - https://leetcode.com/problems/maximum-sum-circular-subarray/
    Accepted
 */
public class MaximumSumCircularSubarray {

    public static void main(String[] args) {
        int[] arr = {-5,4,-6};
        System.out.println(maxSubarraySumCircular(arr));;
    }

    public static int maxSubarraySumCircular(int[] A) {
        int len = A.length;
        if (len < 1) { return 0; }

        int total = A[0], minSum = A[0], min_sum_so_far = A[0];
        int maxSum = A[0], max_sum_so_far = A[0];
        for (int i = 1; i < A.length; i++) {
            if (max_sum_so_far < 0) {
                max_sum_so_far = 0;
            }
            max_sum_so_far = max_sum_so_far + A[i];
            maxSum = Math.max(max_sum_so_far,maxSum);


            if (min_sum_so_far > 0) {
                min_sum_so_far = 0;
            }
            min_sum_so_far = min_sum_so_far + A[i];
            minSum = Math.min(min_sum_so_far, minSum);
            total += A[i];

        }

        System.out.println(maxSum + " " + minSum + " " + total);

        int ans = Math.max(maxSum, total - minSum);
        return maxSum > 0 ? ans : maxSum;
    }

    public static int minSubArrayLen(int[] nums) {
        int len = nums.length;
        if (len < 1) { return 0; }
        int min = nums[0];
        int sum_so_far = nums[0];
        for (int i = 1; i < len; i++) {
            sum_so_far += nums[i];
            sum_so_far =  Math.min(sum_so_far,nums[i]);
            min = Math.min(min,sum_so_far);
            if (sum_so_far > 0) {
                sum_so_far = 0;
            }
            System.out.println("sum_so_far: "+ sum_so_far +
                    " min: " + min + " current: " + nums[i]);
        }
        return min;
    }
}
