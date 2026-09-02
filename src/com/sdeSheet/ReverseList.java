package com.sdeSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    static void main() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(7, 23, 1, 89, 45)
        );

        Collections.reverse(list);
        PrintCollections.printCollection(list);
    }
}
