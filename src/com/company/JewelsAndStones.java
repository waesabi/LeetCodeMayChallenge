package com.company;

import java.util.HashMap;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            char temp = J.charAt(i);
            map.putIfAbsent(temp, map.getOrDefault(temp,1));
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
