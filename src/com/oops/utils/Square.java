package com.oops.utils;

public class Square extends Shape{
    private int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
