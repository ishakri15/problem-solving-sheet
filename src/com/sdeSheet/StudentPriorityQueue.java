package com.sdeSheet;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    static void main() {
        PriorityQueue<Student> pr = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        pr.offer(new Student("Isha",'A'));
        pr.offer(new Student("Priyanshi",'C'));
        pr.offer(new Student("Kashish",'D'));
        pr.offer(new Student("Janvi",'A'));
        pr.offer(new Student("Dev",'B'));

        System.out.println("Queue is : "+pr);
        System.out.println("Got "+pr.poll());
        System.out.println("Got "+pr.poll());
        System.out.println("Got "+pr.poll());
        System.out.println("Got "+pr.poll());
        System.out.println("Got "+pr.poll());
    }

    public static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "name='" + name + "-"+ grade +"'";
        }
    }
}
