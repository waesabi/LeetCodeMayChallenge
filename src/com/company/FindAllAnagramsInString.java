package com.company;

import java.util.ArrayList;
import java.util.List;


/*

    Amazing Question on sliding window
    Accepted - took help form discuss forum
 */
public class FindAllAnagramsInString {

    public static void main(String[] args) {
        String string = "cbaebabacd";
        String target = "acb";
        System.out.println(findAnagrams(string,target));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int pLen = p.length();
        int sLen = s.length();
        ArrayList<Integer> list = new ArrayList<>();
        if (pLen > sLen) { return list; }
        int[] map = new int[26];
        for (int i = 0; i < pLen; i++) {
            map[p.charAt(i) - 'a']++;
        }
        System.out.println("1st - Map");
        for (int val: map) {
            System.out.print(val + " ");
        }
        System.out.println();

        int left = 0, right = 0;
        System.out.println(s + " " + p);
        while (right < s.length()) {
            if (map[s.charAt(right) - 'a'] > 0) {
                map[s.charAt(right) - 'a']--;
                right++;
                if (right - left == pLen) {
                    list.add(left);
                }
            }
            else if (left == right) {
                left++;
                right++;
            }
            else {
                map[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return list;
    }


}
