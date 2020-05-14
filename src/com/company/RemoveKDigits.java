package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        String str = "1432219";
        int n = 3;
        //4325043
        System.out.println(removeKdigits(str,n));;
    }

    /*
        Approach -
        str = "765028321", n = 5
        if str[i] > str[i+1] delete str[i] because number with str[i] will give larger value

        Example - str = "765028321", n = 5
        i = 0 , 7 > 6 , remove 7, n = 4 , str = "65028321"
        i = 1 , 6 > 5 , remove 6 , n = 3, str = "5028321"
        i = 2 , 5 > 0 , remove 5, n = 2, str = "028321"
        i = 5 , 8 > 3 , remove 8 , n = 1, str =  "02321"
        i = 6 , 3 > 2 , remove 3 , n = 0, str =  "0221"
        Ans = 0221
     */

    public static String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len) { return "0"; }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < len) {
            while (k > 0 && !stack.isEmpty() &&
                    stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        // if numbers r increasing order or equal , 11111, 12345
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        builder.reverse();

        while (builder.length() > 0 && builder.charAt(0) == '0') {
            builder.deleteCharAt(0);
        }
        return builder.length() == 0 ? "0" : builder.toString();
    }




}
