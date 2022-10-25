package com.vdanilau.algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    private final ReverseInteger solution = new ReverseInteger();

    private void doTest(int x, int expected) {
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest(123, 321);
    }

    @Test
    void test2() {
        doTest(-123, -321);
    }

    @Test
    void test3() {
        doTest(120, 21);
    }

}
