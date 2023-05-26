package com.problems.arrays;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,2,3,4,5,7,8,9,4,6,7,4,5,10};
        Arrays.sort(input);
        int j=0;
        for(int i=0;i<input.length-1;i++) {
            if (input[i] != input[i+1]) {
                input[j++] = input[i];
            }
        }
        input[j++] = input[input.length-1];
        for(int k=0; k<j; k++) {
            System.out.println(input[k]+ " ");
        }
    }
}
