package com.company.multithreading.executorService;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        //Print task
        for(int i=1; i<=100; i++){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n%s ,* task done ",Thread.currentThread().getName());
    }

    private char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
