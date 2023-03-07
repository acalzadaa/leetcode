package com.leet;

import java.util.Arrays;

public class MoveZeroes {

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     *
     * To solve this, we create two indexes... one with the "next to non-zero space", and another with a range from 0 to length
     * If a non-zero is found we send the current value to temp, and replace it with the zero from the "next to non-zero index",
     * then move the temp to the "next to non-zero index" space.
     * Do this movement and when it's over you will have the zeroes at the end.
     *
     * Example 1:
     *
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */

    public static void main(String[] args)
    {
        final var nums = new int[]{2,0,3,0,4,0,2,0,0,0,0,2};

        System.out.println(Arrays.toString(move(nums)));
    }

    private static int[] move(int[] nums) {
        int nonZeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIdx];
                nums[nonZeroIdx] = temp;
                nonZeroIdx++;
            }
        }
        return nums;
    }
}
