package com.company;

public class FirstBadVersion {
}
/*

    // Accepted
    public class Solution extends VersionControl {
        public static int foundVersion = -1;
        public int firstBadVersion(int n) {
            Solution sol = new Solution();
            foundVersion = -1;
            badVersion(1, n, sol);
            return foundVersion;
        }

        public static void badVersion(int left, int right, Solution s) {
            if(left > right) { return; }
            int mid = left + (right - left) / 2 ;
            if(s.isBadVersion(mid)) {
                foundVersion = mid;
                badVersion(left, mid - 1,s);
            }
            else {
                badVersion(mid + 1, right,s);
            }
        }
    }

 */
