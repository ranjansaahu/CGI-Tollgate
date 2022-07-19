package com.stackroute.collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    // write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input) {
        if (input <= 0) {
            return "Give proper input not zero or negative";
        } else if (input > 20) {
            return "Give proper input not greater than 20";
        } else {
            StringBuilder s = new StringBuilder();
            Queue<String> q = new LinkedList<String>();
            q.add("1");

            while (input-- > 0) {
                String s1 = q.peek();
                q.remove();
                s.append(s1);
                s.append(" ");
                String s2 = s1;
                q.add(s1 + "0");
                q.add(s2 + "1");
            }
            s.deleteCharAt(s.length() - 1);
            return s.toString();
        }
    }
}