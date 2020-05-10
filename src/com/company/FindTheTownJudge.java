package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheTownJudge {

    public static void main(String[] args) {
        int N =1;
        int[][] arr = {};
        System.out.println(findJudge(N,arr));;
    }

    // Accepted
    public static int findJudge(int N, int[][] trust) {
        // if there is only one person
        if (N == 1) { return 1;}
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> notJudge = new HashSet<>();

        for (int i = 0; i < trust.length; i++) {
            int temp[] = trust[i];
            map.remove(temp[0]);
            notJudge.add(temp[0]);
            if (notJudge.contains(temp[1])) { continue; }
            map.put(temp[1], map.getOrDefault(temp[1], 0) + 1);
        }

        System.out.println(map);
        int size = map.size();
        if (size == 0) { return -1; }
        for (int key: map.keySet()) {
            if (map.get(key) == (N-1)) {
                return key;
            }
        }
        return -1;
    }
}
