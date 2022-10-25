package com.vdanilau.algorithms.easy;

public class RemoveDuplicatesFromSortedArraySolution {

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    public int removeDuplicates_(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int removedElementsCount = 0;
            int j = i + 1;
            if (j >= size || nums[i] != nums[j]) continue;
            while (j < size && nums[i] == nums[j]) {
                j++;
                removedElementsCount++;
            }
            int k = i + 1;
            while (j < size) {
                nums[k] = nums[j];
                k++;
                j++;
            }
            size -= removedElementsCount;
        }
        return size;
    }

}
