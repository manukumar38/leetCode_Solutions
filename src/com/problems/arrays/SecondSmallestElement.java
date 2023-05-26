package com.problems.arrays;

public class SecondSmallestElement {

    public static void main(String[] args) {
        int[] input = {-1,7,1,34,18,78};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < smallest) {
                smallest = input[i]; //-1
            }
            if (input[i] > smallest && input[i] < secondSmallest) {
                secondSmallest = input[i]; //3
            }
        }

        System.out.println(secondSmallest);
    }
}
