package com.company;

import java.util.List;

public class MethodReference {
    static void main() {
        List<Integer> numbers = List.of(6,9,8,2,1,5);
        /*numbers.stream()
                .filter(num -> num%2 != 0)
                .forEach(n -> System.out.println(n));*/
        /*int newSum2 = numbers.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.println("Sum using reduce with lambda : "+newSum2);*/

        //method reference
        numbers.stream()
                .filter(num -> num%2 != 0)
                .forEach(System.out::println);

        int newSum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum using reduce with lambda : "+newSum2);
    }
}
