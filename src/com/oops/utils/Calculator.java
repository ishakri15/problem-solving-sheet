package com.oops.utils;

import com.oops.geometry.Circle;
import com.oops.geometry.Rectangle;

public class Calculator {

    static void main() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(6,8);

        double circleArea = Math.PI * circle.radius * circle.radius;
        double rectangleArea = rectangle.length * rectangle.breadth;

        System.out.println("Area of circle is "+circleArea);
        System.out.println("Area of rectangle is "+rectangleArea);
    }
}
