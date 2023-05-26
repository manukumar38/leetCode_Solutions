package com.problems.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] merge (int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] result = new int[len1 + len2];
        int i=0,j=0,k=0;

        while (i < len1 && j < len2){
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while(i < len1){
            result[k++] = arr1[i++];
        }
        while(j < len2){
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,6,7,9};
        int[] arr2 = {2,4,5,8,10,11,12,13,14};
        int[] result = merge(arr1,arr2);
        System.out.println(Arrays.toString(result));

    }
}
