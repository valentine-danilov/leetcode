package com.vdanilau.algorithms.easy;

public class RemoveElementSolution {

    public int removeElement(int[] nums, int val) {
        int lastElementIndex = nums.length - 1;
        for (int i = 0; i < lastElementIndex + 1; i++) {
            if (nums[i] == val) {
                while (lastElementIndex >= 0 && nums[i] == nums[lastElementIndex]) {
                    lastElementIndex--;
                }
                if (lastElementIndex > i) {
                    nums[i] = nums[lastElementIndex--];
                }
            }
        }
        return lastElementIndex + 1;
    }

}
