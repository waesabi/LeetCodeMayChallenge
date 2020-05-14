package com.company;

public class SingleElementInASortedArray {

    // Accepted
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        return binarySearchElement(nums, 0, len - 1);

    }

    // Good question - think about it
    public static int binarySearchElement(int[] nums, int start ,int end) {

        if (start > end) {
            System.out.println(start + " > " + end);
            return -1; }
        if (start == end) { return nums[start]; }
        int mid = (end + start) / 2;
        System.out.println(start + " " + end + " mid: " + mid);
        if (mid % 2 == 0) {
            if (nums[mid] == nums[mid + 1]) {
                return binarySearchElement(nums, mid + 2, end);
            }
            else {
                return binarySearchElement(nums, start, mid);
            }
        }
        else {
            if (nums[mid] == nums[mid - 1]) {
                return binarySearchElement(nums, mid + 1, end);
            }
            else {
                return binarySearchElement(nums, start, mid - 1);
            }
        }
    }
}
