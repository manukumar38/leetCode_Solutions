package com.problems.arrays;

import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7,8};
        int index = 2;

        int[] output = new int[input.length-1];
        for(int i=0,k=0; i < input.length; i++) {
            if (i == index){
                continue;
            }
            output[k++] = input[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
