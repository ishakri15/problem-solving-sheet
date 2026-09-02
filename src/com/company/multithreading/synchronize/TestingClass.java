package com.company.multithreading.synchronize;

public class TestingClass {
    static void main() {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted"+e.getMessage());
        }

        long endTime = System.currentTimeMillis();

        System.out.println("No. of counts : "+counter.getCount()
                +" and Time taken : "+(endTime-startTime));
    }
}
