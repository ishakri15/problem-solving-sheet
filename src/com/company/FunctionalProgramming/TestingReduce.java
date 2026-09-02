package com.company.FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    static void main() {
        List<Integer> numbers = List.of(1,5,9,3,7,8);
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        System.out.println("Normal sum : "+sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.println("Sum using reduce : "+newSum);

        int newSum2 = numbers.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.println("Sum using reduce with lambda : "+newSum2);

        int maxNum = numbers.stream()
                .reduce(Integer.MIN_VALUE,(a,b) -> a>b ? a : b);
        System.out.println("Maximum value : "+maxNum);

    }
}
