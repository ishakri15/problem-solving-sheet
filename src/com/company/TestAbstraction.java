package com.company;

public class TestAbstraction {
    static void main() {
        //Vehicle v = new Vehicle(8);
        Gaadii g = new Gaadii(4);
        System.out.println(g.getNoOfWheels());
        g.startSound();;
    }
}
