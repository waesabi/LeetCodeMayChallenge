package com.company;

/*
    Problem Link - https://leetcode.com/problems/permutation-in-string/
    Accepted
 */
public class PermutationInString {

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[] temp = new int[26];
        for (int i = 0; i < len1; i++) {
            temp[s1.charAt(i) - 'a']++;
        }

        System.out.println("1st - Map");
        for (int val: temp) {
            System.out.print(val + " ");
        }
        System.out.println();

        int windowStart = 0, windowEnd = 0;
        while (windowEnd < len2) {
            if (temp[s2.charAt(windowEnd) - 'a'] > 0) {
                temp[s2.charAt(windowEnd) - 'a']--;
                windowEnd++;
                if (windowEnd - windowStart == len1) {
                    return true;
                }
            }
            else if (windowEnd == windowStart) {
                windowEnd++;
                windowStart++;
            }
            else {
                temp[s2.charAt(windowStart++) - 'a']++;
            }
        }
        return false;
    }
}
