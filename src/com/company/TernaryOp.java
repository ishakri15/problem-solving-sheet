package com.company;

import java.util.Scanner;

public class TernaryOp {
    static void main(String[] args) {

        //Minimum of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        int min = a>b?b:a;
        System.out.println("Minimum : "+min);

        //Even or Odd
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String ans = num%2==0 ? "Even" : "Odd";
        System.out.println(ans);

        //Absolute value
        System.out.println("Enter any no. : ");
        int n = sc.nextInt();
        int abs = n<=0 ? -n : n;
        System.out.println("Absolute value : "+abs);

        //Student score
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        String category = marks>80 ? "High" : (marks>50 ? "Moderate" : "Low");
        System.out.println("Your category is : "+category);
    }
}
