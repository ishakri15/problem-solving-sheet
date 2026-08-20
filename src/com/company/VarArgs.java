package com.company;

public class VarArgs {
    /*static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }*/

    static int sum(int ...arr){
        //Available as int[] arr
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    static void main(String[] args) {
        System.out.println("sum of 3 and 4 is "+sum(3,4));
        System.out.println("sum of 3, 5 and 4 is "+sum(3,5,4));
        System.out.println("sum of 3, 5, 6 and 4 is "+sum(3,5,6,4));
    }
}
