package com.vdanilau.algorithms.easy;

public class ImplementIndexOfSolution {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || needle.equals(haystack)) return 0;
        if (needle.length() > haystack.length()) return -1;

        char[] hs = haystack.toCharArray();
        char[] ndl = needle.toCharArray();

        for (int i = 0; i < hs.length; i++) {
            if (hs[i] == ndl[0]) {
                int j = 0;
                int k = i;
                while (k < hs.length && j < ndl.length && hs[k] == ndl[j]) {
                    j++;
                    k++;
                }
                if (j == ndl.length) return i;
            }
        }

        return -1;
    }

}
