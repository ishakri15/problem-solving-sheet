package com.company;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        Random rn = new Random();
        int n = rn.nextInt(100);
        do{
            System.out.println("Enter a number between 1-100 : ");
            num = sc.nextInt();
        }while(!checkNum(num,n));
        System.out.println("Congo !!");
    }

    static boolean checkNum(int num, int n){
        if(num == n){
            return true;
        }else if(num > n){
            System.out.println("too high");
        }else if(num < n){
            System.out.println("too low");
        }
        return false;
    }
}
