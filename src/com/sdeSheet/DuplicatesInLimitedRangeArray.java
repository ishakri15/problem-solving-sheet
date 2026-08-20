package com.sdeSheet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice,
// return an array of all the integers that appears twice.
public class DuplicatesInLimitedRangeArray {
    static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
            }else{
                ans.add(num);
            }
        }
        System.out.println(ans);
    }
}
