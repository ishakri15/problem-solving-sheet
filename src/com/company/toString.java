package com.company;

class Car{
    String carName;
    String color;
    int seater;
    int maxSpeed;
    int minSpeed;

    Car(String carName, String color, int seater, int maxSpeed, int minSpeed){
        this.carName = carName;
        this.color = color;
        this.seater = seater;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }

    /*@Override
    public String toString() {
        return "My car name is "+carName+" of color "+color;
    }*/
    //OR

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", color='" + color + '\'' +
                ", seater=" + seater +
                ", maxSpeed=" + maxSpeed +
                ", minSpeed=" + minSpeed +
                '}';
    }
}
public class toString {
    static void main() {
        Car car = new Car("Range rover", "black", 7, 250, 100);
        System.out.println(car.toString());
    }
}
