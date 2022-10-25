package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionsSolutionTest {

    private final SearchInsertPositionsSolution solution = new SearchInsertPositionsSolution();

    private void doTest(int[] nums, int target, int expected) {
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest(new int[]{1, 3, 5, 6}, 5, 2);
    }

    @Test
    void test2() {
        doTest(new int[]{1, 3, 5, 6}, 2, 1);
    }

    @Test
    void test3() {
        doTest(new int[]{1, 3, 5, 6}, 7, 4);
    }

    @Test
    void test4() {
        doTest(new int[]{1, 3, 5, 6}, 0, 0);
    }

    @Test
    void test5() {
        doTest(new int[]{1}, 2, 1);
    }

    @Test
    void test6() {
        doTest(new int[]{1, 3}, 2, 1);
    }

}
