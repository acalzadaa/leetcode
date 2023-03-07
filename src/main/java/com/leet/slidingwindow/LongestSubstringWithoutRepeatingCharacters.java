package com.leet.slidingwindow;

import java.util.HashSet;

/**
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args)
    {
        final var input = "abcabcdbb";
        System.out.println(findBiggestLength(input));
    }

    private static int findBiggestLength(String input) {
        int n = input.length();
        final var set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(input.charAt(j)))
            {
                set.add(input.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else
            {
                set.remove(input.charAt(i++));
            }
        }
        return ans;
    }
}
