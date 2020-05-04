package com.company;

public class NumberComplement {

    public static void main(String[] args) {
        findComplement(2147483647);
        findComplement(5);
    }

    // Accepted
    public static int findComplement(int num) {
        int count = 0;
        int value = 0;
        while (num != 0) {
            int rem = num % 2 == 1 ? 0 : 1;
            value = (int) (value + rem * (Math.pow(2,count)));
            count++;
            num /= 2;
        }
        System.out.println(value);
        return value;
    }

}
