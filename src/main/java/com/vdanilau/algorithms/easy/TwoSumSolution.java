package com.vdanilau.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedElements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int difference = target - number;
            if (visitedElements.containsKey(difference)) {
                return new int[]{visitedElements.get(difference), i};
            }
            visitedElements.put(number, i);
        }
        return null;
    }
}
