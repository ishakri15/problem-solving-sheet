package com.company;

class A{
    private int a;

    public void setA(int a){
        this.a = a;
    }

    A(int a){
        this.a = a; //if we write a=a , it will throw an error, so for reference we use this keyword
    }

    public int getA() {
        return a;
    }
}

class B extends A{
    B(int b){
        super(b);

        setA(2);

        System.out.println("I am a constructor of B class");
    }
}
public class Inheritance {
    static void main(String[] args) {
        A a = new A(5);
        System.out.println(a.getA());

        B b = new B(4);
        System.out.println(b.getA());
    }
}
