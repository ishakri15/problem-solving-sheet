package com.sdeSheet;

public class KadaneAlgo {
    static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
