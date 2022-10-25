package com.vdanilau.algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    private final StringToInteger solution = new StringToInteger();

    private void doTest(String s, int expected) {
        int actual = solution.myAtoi(s);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
       doTest("42", 42);
    }

    @Test
    void test2() {
        doTest("    42", 42);
    }

    @Test
    void test3() {
        doTest("    -42", -42);
    }

    @Test
    void test4() {
        doTest("4193 with words", 4193);
    }

    @Test
    void test5() {
        doTest("-91283472332", -2147483648);
    }

    @Test
    void test6() {
        doTest("   +0 123", 0);
    }

    @Test
    void test7() {
        doTest("21474836460", 2147483647);
    }

    @Test
    void test8() {
        doTest("2147483646", 2147483646);
    }
}
