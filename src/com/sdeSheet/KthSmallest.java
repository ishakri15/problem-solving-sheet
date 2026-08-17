package com.sdeSheet;

//Given an integer array arr[] and an integer k,
//find and return the kth smallest element in the given array.

import java.util.Arrays;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        // Code here
        /* for(int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } */
        Arrays.sort(arr);
        int kthMin = arr[k-1];
        return kthMin;
    }
    static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        System.out.println(kthSmallest(arr,k));
    }
}
