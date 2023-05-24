package com.problems.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,2,3,4,5,7,8,9,4,6,7,4,5,10};
        Arrays.stream(input).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .forEach(x -> System.out.print("\n DuplicateElement -->"+x.getKey()+" with occurence -->"+x.getValue()));

        List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
        List<Integer> collect = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1).distinct()
                .collect(Collectors.toList());
        System.out.println("\n"+collect);
    }
}
