package com.sdeSheet;

import java.util.ArrayList;

public class MinAndMaxArray {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        ans.add(min);
        ans.add(max);

        return ans;
    }
    static void main(String[] args) {
        int[] arr = {47, 12, 89, 5, 31, 68, 23, 95, 18, 56};
        System.out.println(getMinMax(arr));
    }
}
