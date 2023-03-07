package com.leet.hashmap;


/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] intArray = new int[]{2, 7, 11, 15};
        final var result = getResult(intArray, 3);
        System.out.println("THE RESULT IS: " + result[0] + " and " + result[1]);
    }

    public static int[] getResult(int[] numbers, int target)
    {
        for (int x = 0; x < numbers.length; x++) {

            for (int y = x + 1; y < numbers.length; y++) {

                System.out.println(numbers[x] + " " + numbers[y]);
                if(numbers[x] + numbers[y] == target)
                {
                    final var intArray = new int[2];
                    intArray[0] = x;
                    intArray[1] = y;
                    return intArray;
                }

            }
        }
        return new int[2];
    }

}
