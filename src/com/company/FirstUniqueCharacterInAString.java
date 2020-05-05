package com.company;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    // Accepted
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (map.get(temp) == 1) { return i; }
        }
        return -1;
    }
}
