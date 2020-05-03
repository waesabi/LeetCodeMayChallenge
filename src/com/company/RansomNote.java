package com.company;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    // Accepted
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char temp : magazine.toCharArray()) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for (char temp : ransomNote.toCharArray()) {
            System.out.println(map);
            if (map.containsKey(temp)) {
                if (map.get(temp) == 1) {
                    map.remove(temp);
                    continue;
                }
                map.put(temp, map.get(temp) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

}
