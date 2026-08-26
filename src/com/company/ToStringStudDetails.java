package com.company;

class Student{
    String name;
    int age;
    int rollno;
    String classroom;

    Student(String name, int age, int rollno, String classroom){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return name+" from "+
                classroom+" holding roll no. "+
                rollno+" is "+age+" years old.";
    }
}
public class ToStringStudDetails {
    static void main() {
        Student isha = new Student("Isha",22,819,"Xth A");
        System.out.println(isha.toString());
    }
}
