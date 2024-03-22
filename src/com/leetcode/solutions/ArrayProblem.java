package com.leetcode.solutions;

public class ArrayProblem {
    public static void main(String[] args) {

        int[] arr = {1,0,3,4,0,6,7,0,4,0,6};
        int index = 0;

        for(int i=0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < arr.length ; i++) {
            arr[i] = 0;
        }
        System.out.println("index : "+index);
        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
    }
}