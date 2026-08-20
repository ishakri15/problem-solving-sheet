package com.sdeSheet;

public class RotateArrayByOne {
    static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 4, 2, 1, 3};
        int temp = arr[arr.length-1];
       for(int i=arr.length-1; i>0; i--){
           arr[i] = arr[i-1];
       }
       arr[0] = temp;
       for(int num : arr){
           System.out.print(num+" ");
       }
    }
}
