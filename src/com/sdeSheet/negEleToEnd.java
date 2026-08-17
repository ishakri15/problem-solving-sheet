package com.sdeSheet;

//Given an unsorted array arr[ ] having both negative and positive integers.
// Place all negative elements at the end of the array without changing the order of positive elements and negative elements.

public class negEleToEnd {
    static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int[] temp = new int[arr.length];
        int index = 0;
        for(int num : arr){
            if(num >= 0){
                temp[index++] = num;
            }
        }
        for(int num : arr){
            if(num < 0){
                temp[index++] = num;
            }
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
