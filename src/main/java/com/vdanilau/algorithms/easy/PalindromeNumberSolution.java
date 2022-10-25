package com.vdanilau.algorithms.easy;

public class PalindromeNumberSolution {

    public boolean isPalindrome(int x) {
        int y = 0;
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        while (y < x) {
            y = (y * 10) + x % 10;
            x /= 10;
        }
        return y == x || y / 10 == x;
    }
}
