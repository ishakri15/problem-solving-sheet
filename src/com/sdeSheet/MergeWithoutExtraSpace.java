package com.sdeSheet;

import java.util.Arrays;

//Given two sorted arrays a[] and b[] of size n and m respectively,
// the task is to merge them in sorted order without using any extra space.
// Modify a[] so that it contains the first n elements and modify b[] so that
// it contains the last m elements.
public class MergeWithoutExtraSpace {
    static void main(String[] args) {
        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(b[j]<a[i]){
                    int temp = b[j];
                    b[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        Arrays.sort(b);
        for(int num : a){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int num : b){
            System.out.print(num+" ");
        }
    }
}
