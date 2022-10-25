package com.vdanilau.algorithms.medium;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int h = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j) {
            while (height[i] <= h && i < j) i++;
            while (height[j] <= h && i < j) j--;
            h = Math.min(height[i], height[j]);
            int volume = (j - i) * h;
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
            max = Math.max(max, volume);
        }
        return max;
    }

}
