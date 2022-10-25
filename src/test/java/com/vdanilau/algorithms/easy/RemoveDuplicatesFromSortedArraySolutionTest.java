package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Arrays;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArraySolutionTest {

    private static final String LENGTH_DIFFERENCE_MESSAGE =
            "New array length is wrong: expected [%d], but was [%d].";
    private static final String ELEMENT_DIFFERENCE_MESSAGE =
            "Elements are different at index [%d]: expected [%d], but was [%d].";

    private static final String ARRAYS_NOT_EQUALS_MESSAGE =
            "Expected: %s. Actual: %s";

    final RemoveDuplicatesFromSortedArraySolution solution = new RemoveDuplicatesFromSortedArraySolution();

    @Test
    void test1() {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expected = {0, 1, 2, 3, 4};
        doTest(input, expected);
    }

    @Test
    void test2() {
        int[] input = {0, 0, 1};
        int[] expected = {0, 1};
        doTest(input, expected);
    }

    @Test
    void test3() {
        int[] input = {1, 1};
        int[] expected = {1};
        doTest(input, expected);
    }

    private void doTest(int[] input, int[] expected) {
        int newLength = solution.removeDuplicates(input);
        try {
            assertEquals(expected.length, newLength, format(LENGTH_DIFFERENCE_MESSAGE, expected.length, newLength));
            for (int i = 0; i < newLength; i++) {
                assertEquals(expected[i], input[i], format(ELEMENT_DIFFERENCE_MESSAGE, i, expected[i], input[i]));
            }
        } catch (AssertionFailedError e) {
            Assertions.fail(format(ARRAYS_NOT_EQUALS_MESSAGE, Arrays.toString(expected), intArrayToStringUntil(input, newLength)));
        }
    }

    private String intArrayToStringUntil(int[] array, int to) {
        return Arrays.toString(array).substring(0, to);
    }
}
