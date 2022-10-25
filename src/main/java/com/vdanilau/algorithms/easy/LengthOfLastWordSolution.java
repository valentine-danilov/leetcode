package com.vdanilau.algorithms.easy;

public class LengthOfLastWordSolution {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int i = chars.length - 1;

        while (i >= 0 && chars[i] == ' ') {
            i--;
        }

        int length = 0;
        while (i >= 0 && chars[i] != ' ') {
            length++;
            i--;
        }

        return length;
    }

}
