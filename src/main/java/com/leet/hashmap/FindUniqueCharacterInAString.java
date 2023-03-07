package com.leet.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueCharacterInAString {
    /**
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     * Input: s = "leetcode"
     * Output: 0
     */
    public static void main(String[] args)
    {
        final var input = "loveleetcode";
        System.out.println(getUniqueCharacter(input));
    }

    private static int getUniqueCharacter(String input) {

        final var mapOfOcurrences = input.chars()
                                         .mapToObj(c -> (char) c)
                                         .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        final var uniqueChar = mapOfOcurrences.entrySet().stream()
                                              .filter(entry -> entry.getValue() == 1)
                                              .map(Map.Entry::getKey)
                                              .findFirst();

        return uniqueChar.map(input::indexOf).orElse(-1);
    }
}
