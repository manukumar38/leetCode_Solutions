package com.sample.practice;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestInArray {

    public static void main(String[] args) {

        int[] input = {2,5,3,7,8,4,9,11};
        Integer SecondHighestElement = Arrays.stream(input).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(SecondHighestElement);
    }
}
