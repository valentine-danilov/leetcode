package com.vdanilau.algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater solution = new ContainerWithMostWater();

    private void doTest(int[] height, int expected) {
        int actual = solution.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        doTest(new int[]{1,8,6,2,5,4,8,3,7}, 49);
    }

    @Test
    void test2() {
        doTest(new int[]{1,1}, 1);
    }

    @Test
    void test3() {
        doTest(new int[]{1,2,1}, 2);
    }

}
