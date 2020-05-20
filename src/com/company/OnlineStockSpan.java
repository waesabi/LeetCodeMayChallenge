package com.company;

import java.util.ArrayList;

/*
    Problem Link - https://leetcode.com/problems/online-stock-span/
    Accepted
 */
public class OnlineStockSpan {
    ArrayList<Integer> prices;
    ArrayList<Integer> countList;
    public OnlineStockSpan() {
        prices = new ArrayList<>();
        countList = new ArrayList<>();
    }

    public int next(int price) {
        int count = 0;
        int size = prices.size();
        if (size == 0) {
            countList.add(1);
            count = 1;
        }
        else {
            int lastIndex = prices.size() - 1;
            for (int i = lastIndex; i >= 0; i -= countList.get(i)) {
                if (prices.get(i) > price) { break; }
                count += countList.get(i);
            }
            count += 1;
            countList.add(count);
        }
        prices.add(price);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        OnlineStockSpan obj = new OnlineStockSpan();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(obj.next(arr[i]));
        }

        System.out.println(obj.countList);
        System.out.println(obj.prices);
    }
}
