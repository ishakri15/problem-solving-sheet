package com.company.multithreading;

public class JoinMethod {
    static void main() throws InterruptedException {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('#');
        PrintTask p3 = new PrintTask('^');

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(p1);
        //t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("\nThread 1 started");
        t1.start();
        Thread t2 = new Thread(p2);
        //t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("\nThread 2 started");
        t2.start();
        t1.join();
        Thread t3 = new Thread(p3);
        //t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println("\nThread 3 started");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal time taken : "+(endTime-startTime));
    }
}
