package com.leetcode.solutions;

public class FindNthLargest {

    public static int findNthLargest(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {// to find nth smallest arr[i] < min
                max = arr[i];
            }
        }

        int nthLargest = max;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > nthLargest) { // to find nth smallest arr[j] < nthLargest
                    nthLargest = arr[j];
                }
            }
        }

        return nthLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 3, 2};
        int n = 3;

        int nthLargest = findNthLargest(arr, n);
        System.out.println("The " + n + "th largest element in the array is " + nthLargest);
    }
}
