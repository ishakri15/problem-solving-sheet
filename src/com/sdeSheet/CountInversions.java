package com.sdeSheet;
//Given an array of integers arr[]. You have to find the Inversion Count of the array.
// Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
public class CountInversions {
    static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
