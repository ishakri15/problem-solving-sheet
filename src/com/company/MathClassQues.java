package com.company;

import java.util.Random;

class CircleInfo{
    int radius;
    CircleInfo(int radius){
        this.radius = radius;
    }
    double calcArea(){
        return Math.PI*radius*radius;
    }
    double calcCircumference(){
        return 2*Math.PI*radius;
    }
}
public class MathClassQues {
    static void main() {

        //Math.PI
        CircleInfo cr = new CircleInfo(2);
        System.out.println("Area of circle : "+cr.calcArea());
        System.out.println("Circumference of circle : "+cr.calcCircumference());

        //Math.Random
        Random rn = new Random();
        int dice = rn.nextInt(7);
        System.out.println("Dice rolled and you got : "+dice);
    }
}
