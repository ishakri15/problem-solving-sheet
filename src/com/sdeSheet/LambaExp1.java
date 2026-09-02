package com.sdeSheet;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambaExp1 {
    static void main() {
        //1
        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        int multi = multiply.apply(5,6);
        System.out.println(multi);

        //2
        String[] arr = {"apple","banana","cherry"};
        Arrays.stream(arr).forEach(str -> System.out.println(str));

        //3
        List<String> list = List.of("hippopotamus","dinasaurs","rhinosaurs","dogs","cats");
        String result = list.stream()
                .filter(an -> an.length() >= 10)
                .reduce("",(a,b) -> a+" "+b);
        System.out.println(result);

        //4
        List<Integer> numbers = List.of(6,9,8,2,1,5);
        numbers.stream()
                .filter(num -> num%2 != 0)
                .forEach(n -> System.out.println(n));
    }
}
