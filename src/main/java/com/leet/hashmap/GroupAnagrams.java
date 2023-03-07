package com.leet.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     *     Input: strs = ["eat","tea","tan","ate","nat","bat"]
     *     Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */

    public static void main(String[] args)
    {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(findGroupAnagrams(strs));
    }

    private static List<List<String>> findGroupAnagrams(String[] strs) {

        final var map = new HashMap<String, List<String>>();
        Arrays.stream(strs).forEach(word -> {
            final var chars = word.toCharArray();
            Arrays.sort(chars);
            final var sorted = new String(chars);
            map.computeIfAbsent(sorted, k-> new ArrayList<>()).add(word);
        });
        return new ArrayList<>(map.values());

    }
}
