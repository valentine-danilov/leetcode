package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerSolutionTest {

    private final RomanToIntegerSolution solution = new RomanToIntegerSolution();

    private void doTest(String input, int expected) {
        int actual = solution.romanToInt(input);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest("III", 3);
    }

    @Test
    void test2() {
        doTest("LVIII", 58);
    }

    @Test
    void test3() {
        doTest("MCMXCIV", 1994);
    }

    @Test
    void test4() {
        doTest("LIV", 54);
    }
    @Test
    void test5() {
        doTest("IV", 4);
    }
}
