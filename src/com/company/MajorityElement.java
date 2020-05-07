package com.company;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    /*
        Accepted -
        we can do it in O(n) with extra space ,
        but i just used sorting and get middle element
     */
    public static int majorityElement(int[] nums) {
        int mid = nums.length / 2;
        Arrays.sort(nums);
        return nums[mid];
    }
}
