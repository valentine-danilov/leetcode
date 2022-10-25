package com.vdanilau.algorithms.medium;

public class StringToInteger {

    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        boolean numberFound = false;
        int sign = 1;
        int number = 0;
        for (char c : chars) {
            if (!numberFound && c == ' ') continue;

            if (!numberFound && (c == '-' || c == '+')) {
                sign = c == '-' ? -1 : 1;
                numberFound = true;
                continue;
            }

            if (c >= '0' && c <= '9') {
                numberFound = true;
                int nextDigit = c - '0';

                if (number * sign > Integer.MAX_VALUE / 10 || (number * sign == Integer.MAX_VALUE / 10 && nextDigit * sign > 7)) {
                    return Integer.MAX_VALUE;
                }

                if (number * sign < Integer.MIN_VALUE / 10 || (number * sign == Integer.MIN_VALUE / 10 && nextDigit * sign < -8)) {
                    return Integer.MIN_VALUE;
                }

                number = number * 10 + nextDigit;
                continue;
            }
            break;
        }

        return sign * number;
    }
}
