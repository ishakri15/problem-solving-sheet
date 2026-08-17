package com.sdeSheet;

public class Sort012Ques {
    static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int num : arr){
            if(num == 0){
                cnt0++;
            }
            if(num == 1){
                cnt1++;
            }
            if(num == 2) {
                cnt2++;
            }
        }
        int index = 0;
        while(cnt0 > 0){
            arr[index++] = 0;
            cnt0--;
        }
        while(cnt1 > 0){
            arr[index++] = 1;
            cnt1--;
        }
        while(cnt2 > 0){
            arr[index++] = 2;
            cnt2--;
        }
        for(int ar : arr){
            System.out.print(ar+" ");
        }
    }
}
