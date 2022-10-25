package com.vdanilau.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    private final IntegerToRoman solution = new IntegerToRoman();

    private void doTest(int num, String expected) {
        String actual = solution.intToRoman(num);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest(3, "III");
    }

    @Test
    void test2() {
        doTest(58, "LVIII");
    }

}
