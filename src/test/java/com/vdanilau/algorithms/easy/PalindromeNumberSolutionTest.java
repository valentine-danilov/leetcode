package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeNumberSolutionTest {

    private final PalindromeNumberSolution solution = new PalindromeNumberSolution();

    @Test
    void test1() {
        doTest(121, true);
    }

    @Test
    void test2() {
        doTest(123, false);
    }

    @Test
    void test3() {
        doTest(-121, false);
    }

    private void doTest(int input, boolean expected) {
        boolean actual = solution.isPalindrome(input);
        assertEquals(expected, actual);
    }


}
