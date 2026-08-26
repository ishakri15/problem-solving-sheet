package com.company;

class FinalPractice{
    final String name;
    final int age;
    FinalPractice(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : "+this.name+" having age "+this.age);
    }
}
public class FinalKeyword {
    static void main() {
        FinalPractice fp = new FinalPractice("Isha",22);
        fp.display();
    }
}
