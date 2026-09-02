package com.sdeSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class swapElementsInArrayList {

    public static void swapElements(int ind1, int ind2, ArrayList<Integer> list){
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(7, 23, 1, 89, 45)
        );

        PrintCollections.printCollection(list);
        swapElements(1,2,list);
        PrintCollections.printCollection(list);
        swapElements(2,3,list);
        PrintCollections.printCollection(list);
    }
}
