package com.sample.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {

    public static void main(String[] args) {

        String input = "manukumar";
        String[] results = input.split("");
        String FirstNonRepeatElement = Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(FirstNonRepeatElement);
    }
}
