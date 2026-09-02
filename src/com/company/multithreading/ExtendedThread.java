package com.company.multithreading;

public class ExtendedThread {
    static void main() {
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        long startTime = System.currentTimeMillis();

        System.out.println("\nStarting first thread");
        t1.start();
        System.out.println("\nStarting second thread");
        t2.start();
        System.out.println("\nStarting third thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal time taken : "+(endTime-startTime));
    }
}
