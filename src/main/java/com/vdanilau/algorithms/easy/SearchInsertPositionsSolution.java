package com.vdanilau.algorithms.easy;

public class SearchInsertPositionsSolution {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = (nums.length - 1) / 2;

        while (start <= end) {
            if (target == nums[middle]) return middle;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) { // [1,2,3,5,6] t=4, m=3; 4 > 3; s=3, e=4 -> new mIdx = 3
                                                // [1,2,3,5,6] t=4, m=5; 4 < 5; s=3, e=2 -> new mIdx = (2 + 3) / 2 = 2 -> end
                end = middle - 1;               // s=3 t=4
            }
            middle = (start + end) / 2;
        }

        if (nums[middle] > target) {
            if (middle == 0) return middle;
            return middle - 1;
        } else {
            return middle + 1;
        } //or just return start.
    }

}
