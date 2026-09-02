package com.company;

public class Gaadii extends Vehicle{

    @Override
    public void startSound() {
        System.out.println("Starting.........");
    }

    public Gaadii(int noOfWheels) {
        super(4);
    }

    @Override
    public void letsGo() {
        System.out.println("Going............");
    }
}
