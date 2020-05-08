package com.company;

import java.util.HashSet;

public class CheckIfIsAStraightLine {

    public static void main(String[] args) {
        int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(checkStraightLine(coordinates));
    }

    // Accepted
    public static boolean checkStraightLine(int[][] coordinates) {
        HashSet<Float> set = new HashSet<>();
        int size = coordinates.length;
        if (size < 2) { return true; }
        int[] coordinate = coordinates[0];
        for (int i = 1; i < coordinates.length; i++) {
            int[] temp = coordinates[i];
            int yDiff =  (temp[1] - coordinate[1]);
            int xDiff =  (temp[0] - coordinate[0]);
            float slope =  yDiff /(float) xDiff ;
            System.out.println(Math.abs(slope));
            set.add(Math.abs(slope));
        }

        return set.size() == 1;
    }

}
