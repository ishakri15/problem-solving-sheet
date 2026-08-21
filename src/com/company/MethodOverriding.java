package com.company;

class Aa{
    public void meth1(){
        System.out.println("I am method 1 of class Aa");
    }
}
class Bb extends Aa{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class Bb");
    }
}
public class MethodOverriding {
    static void main(String[] args) {
        Aa a = new Aa();
        a.meth1();
        Bb b = new Bb();
        b.meth1();
    }
}
