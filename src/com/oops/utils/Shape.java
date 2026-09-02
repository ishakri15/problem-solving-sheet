package com.oops.utils;

public abstract class Shape {

    private int noOfSides;

    Shape(){
        this.noOfSides = 0;
    }

    Shape(int noOfSides){
        this.noOfSides = noOfSides;
    }

    public int getNoOfSides(){
        return this.noOfSides;
    }
    public abstract double calculateArea();
}
