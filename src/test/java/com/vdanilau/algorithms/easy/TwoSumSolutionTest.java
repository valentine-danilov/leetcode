package com.vdanilau.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumSolutionTest {

    private final TwoSumSolution solution = new TwoSumSolution();

    @Test
    void test1() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        doTest(nums, target, expected);
    }

    @Test
    void test2() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        doTest(nums, target, expected);
    }

    @Test
    void test3() {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] expected = {1, 2};
        doTest(nums, target, expected);
    }

    @Test
    void test4() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        doTest(nums, target, expected);
    }

    @Test
    void asd() {
        String str = """
                {
                  "memberEmailId": 1231231233,
                  "memberId": 123123123123,
                  "memberEventId: 123123123123,
                  "mameCode": "LOCKMEMBER",
                  "sender": "asdasdasdasd@asdasdasd",
                  "password": "pwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwdpwd",
                  "confirmationCode": "asdasdasda",
                  "identifierString": "asdasdasdasd"
                }""";
        System.out.println(str.getBytes().length);
    }


    private void doTest(int[] nums, int target, int[] expected) {
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}
