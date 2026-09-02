package com.company.FunctionalProgramming;

import java.util.Optional;
import java.util.stream.IntStream;

public class FunctionalInterfaceQues {
    static void main() {
        //1
        FuncInterface fun = num -> {
            for(int i=2; i<num/2; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(fun.isPrime(12));

        //2
        int num = 7;
        IntStream.rangeClosed(2,num)
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);

        //3
        System.out.println(toOptional(null));
        System.out.println(toOptional("Pain"));
    }

    //3
    public static Optional<String> toOptional(String str){
        if(str == null || str.isEmpty()){
            return Optional.empty();
        }else{
            return Optional.of(str.toUpperCase());
        }
    }
}
