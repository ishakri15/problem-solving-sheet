package com.sdeSheet;

public class StockBuyAndSell {
    static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int res = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]<arr[j]){
                    max = Math.max(max, arr[j]-arr[i]);
                }
            }
            res += max;
        }
        System.out.println(res);
    }
}
