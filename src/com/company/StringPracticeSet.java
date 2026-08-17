package com.company;

import java.util.Scanner;

public class StringPracticeSet {
    static void main(String[] args) {
        //Problem 1
        String str1 = "LUCYROxy";
        System.out.println(str1.toLowerCase());

        //Problem 2
        String str2 = "Lucy is sad";
        System.out.println(str2.replace(' ','_'));

        //Problem 3
        String greet = "Dear <name>, Thanx a lot";
        String newGreet = greet.replace("<name>","Roxy");
        System.out.println(newGreet);

        //Problem 4
        String myStr = "This string contains  double space and   triple space";
        System.out.println(myStr.indexOf("  "));
        System.out.println(myStr.indexOf("   "));

        //Problem 5
        System.out.println("\"Dear Harry , This Java Course is nice. Thanks \" ");
    }
}
