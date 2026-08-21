package com.sdeSheet;

import java.util.Arrays;

public class MergeSortedArrays {
    static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};
        int mergedArray[] = new int[arr1.length+ arr2.length];
        int idx = 0;
        for(int a : arr1){
            mergedArray[idx] = a;
            idx++;
        }
        for(int a : arr2){
            mergedArray[idx] = a;
            idx++;
        }
        Arrays.sort(mergedArray);
        for(int m : mergedArray){
            System.out.print(m+" ");
        }
    }
}
