package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveElementSolutionTest {

    private final RemoveElementSolution solution = new RemoveElementSolution();

    void doTest(int[] input, int element, int[] expected) {
        int length = solution.removeElement(input, element);
        int[] result = Arrays.copyOf(input, length);
        assertArrayEquals(expected, result);
    }

    @Test
    void test1() {
        int[] input = {3, 2, 2, 3};
        int val = 3;
        int[] expected = {2, 2};
        doTest(input, val, expected);
    }

    @Test
    void test2() {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expected = {0, 1, 4, 0, 3};
        doTest(input, val, expected);
    }

    @Test
    void test3() {
        int[] input = {1};
        int val = 1;
        int[] expected = {};
        doTest(input, val, expected);
    }

    @Test
    void test4() {
        int[] input = {4, 5};
        int val = 5;
        int[] expected = {4};
        doTest(input, val, expected);
    }

    @Test
    void test5() {
        int[] input = {};
        int val = 5;
        int[] expected = {};
        doTest(input, val, expected);
    }

}
