package com.sdeSheet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        Set<Integer> setAB = new HashSet<>();
        for(int num : a){
            setAB.add(num);
        }
        for(int num : b){
            setAB.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>(setAB);
        System.out.println(ans);
    }
}
