package com.leet.hashmap;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 */

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        final var nums1 = new int[]{1,2,2,1};
        final var nums2 = new int[]{2,2};
        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }

    private static int[] findIntersection(int[] nums1, int[] nums2) {

        final var startingMap = Arrays.stream(nums1).boxed().distinct().collect(Collectors.toMap(k-> k, v -> 0));

        Arrays.stream(nums2).boxed().distinct().forEach(number -> {
            if(startingMap.containsKey(number)){
                startingMap.put(number, startingMap.get(number) +1);
            }
        });

        final var resultingSet = startingMap.entrySet().stream().filter(map -> map.getValue() > 0).map(Map.Entry::getKey).collect(Collectors.toSet());
        return resultingSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
