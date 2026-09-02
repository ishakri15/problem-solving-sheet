package com.sdeSheet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListUsingComparator {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Cherry");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);

    }
}
