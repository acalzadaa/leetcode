package com.leet.heap;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    /**
     * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
     *
     * Example 1:
     *
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     *
     * Example 2:
     *
     * Input: nums = [1], k = 1
     * Output: [1]
     */

    public static void main(String[] args)
    {
        final var nums = new int[]{1,1,1,2,2,3};
        final var k = 1;

        System.out.println(Arrays.toString(findTopKUsingHashMap(nums, k)));
    }

    private static int[] findTopKUsingHashMap(int[] nums, int k) {

        final var groupedAndCountedNums = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        final var topKNumbers = groupedAndCountedNums.entrySet().stream().filter(entry -> entry.getValue() == k).map(Map.Entry::getKey).mapToInt(Integer::intValue).toArray();
        return topKNumbers;
    }
}
