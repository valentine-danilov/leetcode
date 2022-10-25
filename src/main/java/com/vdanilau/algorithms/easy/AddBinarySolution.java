package com.vdanilau.algorithms.easy;

public class AddBinarySolution {

    public String addBinary(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        int diff = Math.abs(a.length() - b.length());
        char[] bigger = a.length() >= b.length() ? a.toCharArray() : b.toCharArray();
        char[] other = a.length() >= b.length() ? b.toCharArray() : a.toCharArray();

        StringBuilder sum = new StringBuilder();
        boolean memo = false;
        for (int i = minLength - 1; i + diff >= 0; i--) {
            char c1 = bigger[i + diff];
            char c2 = i >= 0 ? other[i] : '0';

            int bitSum = c1 - c2;
            switch (bitSum) {
                case -1, 1 -> sum.append(memo ? '0' : '1');
                case 0 -> {
                    sum.append(memo ? '1' : '0');
                    memo = c1 == '1' || c2 == '1';
                }
            }
        }

        if (memo) sum.append('1');
        return sum.reverse().toString();
    }

}
