package com.sdeSheet;

public class DeleteEle_Array {
    static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 30, 50};
        int del = 30;
        //No. of occurences
        int count = 0;
        for(int a : arr){
            if(a == del){
                count++;
            }
        }
        int newArr[] = new int[arr.length - count];
        int idx = 0;
        for(int a : arr){
            if(a != del){
                newArr[idx] = a;
                idx++;
            }
        }
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
