package com.problems.arrays;

import java.util.Arrays;

public class SeparateZeroAndOnes {

    public static void main(String[] args) {

        int[] input = {0,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1};

        int[] output = new int[input.length];
        int j = 0;
        //identify 0 and insert first
        for (int i=0; i< input.length;i++) {
            if (input[i] == 0) {
                output[j++] = input[i];
            }
        }
        // fill 1 in the remaining
        while (j< output.length){
            output[j++] = 1;
        }

        System.out.println(Arrays.toString(output));
    }
}
