package com.company.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    static void main() {
        List<String> list = List.of("apple","banana","cherry","date");
        System.out.println(list.size());

        System.out.println("Printing fruits normally : ");
        for(String str : list){
            System.out.println(str);
        }

        System.out.println("Printing fruits with stream : ");
        System.out.println("Consumer : ");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("Lambda Function : ");
        list.stream()
                .filter(fruit -> fruit.endsWith("a"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
