package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] input = {1,4,2,3,5,7,8};
        List<Integer> integerList = Arrays.stream(input).boxed().sorted().collect(Collectors.toList());

        for(int i=0; i< integerList.size()-1;i++){
            if (integerList.get(i) + 1 != integerList.get(i+1)) {
                System.out.println(integerList.get(i) + 1);
            }
        }

    }
}
