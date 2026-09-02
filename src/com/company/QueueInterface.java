package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    static void main() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.offer(3);

        System.out.println("Queue is : ");
        for(int e : queue){
            System.out.print(e+" ");
        }
        System.out.println();

        queue.remove();
        queue.poll();

        System.out.println("Queue is : ");
        for(int e : queue){
            System.out.print(e+" ");
        }

    }
}
