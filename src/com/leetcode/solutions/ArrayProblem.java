package com.leetcode.solutions;

public class ArrayProblem {


    // to move all 0 to end
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        int check0 = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                check0++;
            }
        }

        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while(check0 > 0){
            arr[index++] = 0;
            check0--;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
