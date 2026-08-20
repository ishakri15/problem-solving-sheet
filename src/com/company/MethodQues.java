package com.company;

public class MethodQues {

    //Problem 1
    static void printTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }

    //Problem 2
    static void printPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem 3
    static int calcSum(int n){
        if(n==1){
            return 1;
        }else{
            return n + calcSum(n-1);
        }
    }

    //Problem 4
    static void printPattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem 5
    static int fibo(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }

    //Problem 6
    static int calcAvg(int ...arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        int avg = sum / arr.length;
        return avg;
    }

    //Problem 7
    static void print4_rec(int n){
        if(n == 0){
            return;
        }
        System.out.println(4);
        print4_rec(n-1);
    }

    //Problem 8
    static void print2_rec(int n){
        if(n == 0){
            return;
        }
        System.out.println(2);
        print2_rec(n-1);
    }

    //Problem 9
    static float celToFh(float c){
        float f = (c * 9/5)+32;
        return f;
    }

    //Problem 10
    static void print3_it(int n){
        for(int i=0; i<n; i++){
            System.out.println(3);
        }
    }

    static void main(String[] args) {
        //1
        printTable(8);
        System.out.println();
        //2
        printPattern(4);
        //3
        System.out.println("sum = "+calcSum(10));
        System.out.println();
        //4
        printPattern2(4);
        //5
        System.out.println("fib no. = "+fibo(5));
        System.out.println();
        //6
        System.out.println("Avg of 10, 20 and 30 is "+calcAvg(10,20,30));
        System.out.println();
        //7
        print4_rec(6);
        System.out.println();
        //8
        print2_rec(5);
        System.out.println();
        //9
        System.out.println("farenheit degree = "+celToFh(25));
        System.out.println();
        //10
        print3_it(4);
    }
}
