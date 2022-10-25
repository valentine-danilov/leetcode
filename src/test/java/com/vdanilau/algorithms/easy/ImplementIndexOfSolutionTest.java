package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImplementIndexOfSolutionTest {

    private final ImplementIndexOfSolution solution = new ImplementIndexOfSolution();

    void doTest(String haystack, String needle, int expected) {
        int actual = solution.strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest("aaaaa", "bba", -1);
    }

    @Test
    void test2() {
        doTest("hello", "ll", 2);
    }

}
