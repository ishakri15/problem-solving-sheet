package com.sdeSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountFrequencyUsingCollection {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(1, 2, 3, 2, 4, 1, 2, 5, 3, 2)
        );
       int count = Collections.frequency(arr,2);
        System.out.println(count);
    }
}
