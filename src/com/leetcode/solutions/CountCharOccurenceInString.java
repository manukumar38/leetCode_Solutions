package com.leetcode.solutions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharOccurenceInString {

    public static void main(String[] args) {

        String input = "manukumar";
        String[] results = input.split("");
        Map<String, Long> collect = Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
