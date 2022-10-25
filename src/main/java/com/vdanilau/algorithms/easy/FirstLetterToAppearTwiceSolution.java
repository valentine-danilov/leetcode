package com.vdanilau.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwiceSolution {

    public char repeatedCharacter(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> repetitions = new HashMap<>();
        for (char c : chars) {
            if (repetitions.containsKey(c)) return c;
            repetitions.put(c, 1);
        }
        return '0';
    }
}
