package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddBinarySolutionTest {

    private final AddBinarySolution solution = new AddBinarySolution();

    private void doTest(String a, String b, String expected) {
        String actual = solution.addBinary(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest("11", "1", "100");
    }

    @Test
    void test2() {
        doTest("1010", "1011", "10101");
    }

    @Test
    void test3() {
        doTest("1", "111", "1000");
    }

}
