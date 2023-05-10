package com.leetcode.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartsWith1InArray {

    public static void main(String[] args) {
        int[] input = {3,11,34,15,43,12,17,32};

        List<String> stringList = Arrays.stream(input).boxed()
                .map(x -> x + "")
                .filter(str -> str.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(stringList);

    }
}
