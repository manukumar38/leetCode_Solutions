package com.sample.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {

    public static void main(String[] args) {

        String input = "manukumar";
        String[] results = input.split("");
        //To get results as [a=2, u=2, m=2]
        List<Map.Entry<String, Long>> collect = Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)// To get unique characters .filter(x -> x.getValue == 1)
                .collect(Collectors.toList());
        System.out.println(collect);

        //To get only characters [a, u, m]
        List<String> collect1 = Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
