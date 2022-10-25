package com.vdanilau.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {

    public int romanToInt(String s) {
        Map<Character, Integer> intValues = new HashMap<>();
        int result = 0;
        intValues.put('I', 1);
        intValues.put('V', 5);
        intValues.put('X', 10);
        intValues.put('L', 50);
        intValues.put('C', 100);
        intValues.put('D', 500);
        intValues.put('M', 1000);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int current = intValues.get(chars[i]);
            if (i > 0) {
                int prev = intValues.get(chars[i - 1]);
                if (prev < current) {
                    result = result - prev + (current - prev);
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }

        return result;
    }
}
