package com.company;

import java.util.Scanner;

public class GreetUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", Good morning !!");

        //Check whether entered no. is integer or not
        System.out.println("Enter a number ");
        System.out.println(sc.hasNextInt());

        char ch = 'a';
        System.out.println(ch++);
        System.out.println(ch);
    }
}
