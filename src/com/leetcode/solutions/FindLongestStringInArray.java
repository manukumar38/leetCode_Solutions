package com.leetcode.solutions;

import java.util.*;
import java.util.stream.Collectors;

public class FindLongestStringInArray {

    public static void main(String[] args) {

        //reduce approach
        String[] input = {"docker", "kubernetes", "springboot", "mongoDb", "microservices"};
        String longestStringInArray1 = Arrays.stream(input)
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();

        System.out.println(longestStringInArray1);

        //max approach
        String longestStringInArray2 = Arrays.stream(input)
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(longestStringInArray2);

        //map approach to find length of longest string
        Integer longestStringInArray3 = Arrays.stream(input)
                .map(String::length)
                .max(Integer::compare)
                .get();

        System.out.println(longestStringInArray3);

        //collect approach
        String longestStringInArray4 = Arrays.stream(input)
                .collect(Collectors.maxBy(Comparator.comparingInt(String::length)))
                .get();

        System.out.println(longestStringInArray4);

        //collect approach to get length
        Integer longestStringInArray5 = Arrays.stream(input)
                .collect(Collectors.summarizingInt(String::length))
                .getMax();

        System.out.println(longestStringInArray5);

        //sorted approach
        String longestStringInArray6 = Arrays.stream(input)
                .sorted((str1,str2) -> str1.length()>str2.length()?-1:1)
                        .findFirst()
                                .get();
        System.out.println(longestStringInArray6);

        //Collections.max
        String longestStringInArray7 = Collections.max(Arrays.asList(input), Comparator.comparingInt(String::length));

        System.out.println(longestStringInArray7);


    }
}
