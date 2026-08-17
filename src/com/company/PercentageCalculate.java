package com.company;

import java.util.Scanner;

public class PercentageCalculate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths marks : ");
        float mathsMarks = sc.nextFloat();
        System.out.println("Enter Science marks : ");
        float sciMarks = sc.nextFloat();
        System.out.println("Enter English marks : ");
        float engMarks = sc.nextFloat();
        System.out.println("Enter Hindi marks : ");
        float hindiMarks = sc.nextFloat();
        System.out.println("Enter Sst marks : ");
        float sstMarks = sc.nextFloat();

        float totalMarks = mathsMarks+sciMarks+engMarks+hindiMarks+sstMarks;

        float per = (totalMarks/500) * 100;

        System.out.println("Total percentage : "+per);
    }
}
