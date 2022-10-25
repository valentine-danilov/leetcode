package com.vdanilau.algorithms.easy;

import java.util.Arrays;

public class PlusOneSolution {

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        if (digits[i] < 9) {
            int[] result = Arrays.copyOf(digits, digits.length);
            result[i]++;
            return result;
        }

        int[] result = Arrays.copyOf(digits, digits.length);
        while (i >= 1 && result[i] == 9) {
            result[i] = 0;
            i--;
        }
        if (i == 0 && result[i] == 9) {
            result[i] = 1;
            int[] expandedResult = Arrays.copyOf(result, result.length + 1);
            expandedResult[i+ 1] = 0;
            return expandedResult;
        } else {
            result[i]++;
        }
        return result;
    }
}
