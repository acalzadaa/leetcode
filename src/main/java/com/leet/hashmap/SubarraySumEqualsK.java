package com.leet.hashmap;

/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * <p>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 */
public class SubarraySumEqualsK {

    public static void main(String[] args)
    {
        final var nums = new int[]{1, 2, 3};
        final var k = 3;

        System.out.println(findCombinations(nums, k));

    }

    private static int findCombinations(int[] nums, int k) {

        var acum = 0;
        for (int x = 0; x < nums.length - 1; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] == k) {
                    acum++;
                }
            }
        }
        return acum;

    }

}
