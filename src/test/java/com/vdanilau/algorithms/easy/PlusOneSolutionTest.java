package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneSolutionTest {

    private final PlusOneSolution solution = new PlusOneSolution();

    private void doTest(int[] digits, int[] expected) {
        int[] actual = solution.plusOne(digits);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest(new int[]{1, 2, 3}, new int[]{1, 2, 4});
    }

    @Test
    void test2() {
        doTest(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2});
    }

    @Test
    void test3() {
        doTest(new int[]{9}, new int[]{1, 0});
    }
}
