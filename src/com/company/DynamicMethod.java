package com.company;

class Phone{
    public void greet(){
        System.out.println("Welcome, Good morning");
    }
    public void turnOn(){
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void turnOn(){
        System.out.println("Turning on SmartPhone");
    }
}
public class DynamicMethod {
    static void main(String[] args) {
        //SmartPhone obj = new Phone(); //Not allowed
        Phone obj = new SmartPhone();
        obj.turnOn();
        obj.greet();
        //obj.music(); //Not allowed
        SmartPhone obj2 = new SmartPhone();
        obj2.music();
    }
}
