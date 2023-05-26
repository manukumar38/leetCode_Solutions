package com.leetcode.solutions;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSumSolution {

    public static void main(String[] args) {

        int[] input = {1,4,2,6,7,5,9,3,8};
        //find all possible no pair whose sum is 10
        List<Integer> inputList = Arrays.stream(input).boxed().collect(Collectors.toList());
        int target = 10;

        // using java 8
        Map<Integer,Integer> resultMap = new HashMap<>();
        for(int i=0;i< inputList.size();i++){
            int diff = target - inputList.get(i);
            if (inputList.contains(diff) && !resultMap.containsKey(inputList.get(i))
                    && (diff != inputList.get(i) || (Collections.frequency(inputList, inputList.get(i)) > 1))) {
                resultMap.put(diff, inputList.get(i));
            }
        }
        resultMap.entrySet().stream().forEach(x -> System.out.println("First Number: "+x.getKey()+" Second Number :"+x.getValue()));

        //using 2 for loop
        for(int i=0; i<input.length; i++) {
            for (int j=i+1; j< input.length; j++) {
                if (input[j] == target - input[i]) {
                    System.out.println(input[i] + "," +input[j]);
                }
            }
        }
    }

}
