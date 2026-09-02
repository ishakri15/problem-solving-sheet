package com.company.multithreading;

public class NeedOfMultithreading {
    static void main() {
        long startTime = System.currentTimeMillis();
        //First task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d* ",i);
        }
        System.out.println("* task done");

        //Second task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d# ",i);
        }
        System.out.println("# task done");

        //Third task
        for(int i=1; i<=1000; i++){
            System.out.printf("%d^ ",i);
        }
        System.out.println("^ task done");
        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken : "+(endTime-startTime));
    }
}
