package com.sdeSheet;

public class NoOfOccurences {
    static void main(String[] args) {
        int arr[] = {4, 2, 7, 4, 8, 4, 1, 9, 2};
        int target = 4;
        int count = 0;
        for(int a : arr){
            if(a == target){
                count++;
            }
        }
        System.out.println(target+" occurred "+count+" times in the array");
    }
}
