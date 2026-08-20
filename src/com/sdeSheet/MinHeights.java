package com.sdeSheet;
import java.util.Arrays;
//import com.company.Arrays;

//Given a array arr[] and positive integer k denoting heights of towers,
// you have to modify the height of each tower either by increasing or decreasing them by k only once.
//Find out what could be the possible minimum difference of the height of shortest
// and longest towers after you have modified each tower. The modified height of the tower can be negative.
public class MinHeights {
    static void main(String[] args) {
        int[] arr = {1, 8, 10, 6, 4, 6, 9, 1};
        int k = 7;
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {

            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            int max = Math.max(arr[i] + k, arr[n - 1] - k);

            ans = Math.min(ans, max - min);
        }
        System.out.println(ans);
    }
}
