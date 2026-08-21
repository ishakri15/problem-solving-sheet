package com.sdeSheet;

public class SumAvgArray {
    static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;
        float avg = 0;
        for(int a : arr){
            sum += a;
        }
        avg = (float) sum/arr.length;

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg);
    }
}
