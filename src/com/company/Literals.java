package com.company;

import java.util.Scanner;

public class Literals {
    static void main(String[] args) {
        byte age = 22;
        int c = 34;
        long l1 = 3455555555555555L;
        char ch = 'H';
        float f1 = 5.6f;
        double d1 = 3.45D;
        //System.out.println(l1);

        //Taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : ");
        int a = sc.nextInt();
        System.out.println("Enter value b : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }
}
