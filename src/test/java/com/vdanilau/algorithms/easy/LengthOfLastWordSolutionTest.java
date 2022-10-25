package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordSolutionTest {

    private final LengthOfLastWordSolution solution = new LengthOfLastWordSolution();

    private void doTest(String s, int expected) {
        int actual = solution.lengthOfLastWord(s);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest("Hello World", 5);
    }

    @Test
    void test2() {
        doTest("   fly me   to   the moon  ", 4);
    }

    @Test
    void test3() {
        doTest("luffy is still joyboy", 6);
    }

    @Test
    void test4() {
        doTest("a", 1);
    }
}
