package com.company;

import org.w3c.dom.ls.LSOutput;
//Problem 1
class Employees{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}

//Problem 2
class CellPhone{
    public void ring(){
        System.out.println("Cell phone is ringing");
    }

    public void vibrate(){
        System.out.println("Cell phone is vibrating");
    }
}

//Problem 3
class Square{
    int side;

    public int calcArea_sq(){
        return side*side;
    }

    public int calcPerimeter_sq(){
        return 4*side;
    }
}

//Problem 4
class Rectangle{
    int l;
    int b;

    public int calArea_rec(){
        return l*b;
    }

    public int calcPerimeter_rec(){
        return 2*(l+b);
    }
}

//Problem 5
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }

    public void run(){
        System.out.println("Running");
    }

    public void fire(){
        System.out.println("Firing");
    }
}

//Problem 6
class Circle{
    int r;

    public double calcArea_circle(){
        return 3.14*r*r;
    }

    public double calcPerimeter_circle(){
        return 2*3.14*r;
    }
}

public class OopsQues {
    static void main(String[] args) {
        //Problem 1
        Employees emp = new Employees();
        emp.name = "Isha";
        emp.salary = 25000;
        System.out.println("Name : "+emp.getName());
        System.out.println("Salary : "+emp.getSalary());
        emp.setName("Annu");
        System.out.println("Changed name : "+emp.getName());
        System.out.println();

        //Problem 2
        CellPhone cell = new CellPhone();
        cell.ring();
        cell.vibrate();
        System.out.println();

        //Problem 3
        Square sq = new Square();
        sq.side = 8;
        System.out.println("Area of square : "+sq.calcArea_sq());
        System.out.println("Perimeter of square : "+sq.calcPerimeter_sq());
        System.out.println();

        //Problem 4
        Rectangle rec = new Rectangle();
        rec.l = 4;
        rec.b = 6;
        System.out.println("Area of rectangle : "+rec.calArea_rec());
        System.out.println("Perimeter of square : "+rec.calcPerimeter_rec());
        System.out.println();

        //Problem 5
        TommyVecetti tv = new TommyVecetti();
        tv.hit();
        tv.run();
        tv.fire();
        System.out.println();

        //Problem 6
        Circle c = new Circle();
        c.r = 4;
        System.out.println("Area of circle : "+c.calcArea_circle());
        System.out.println("Perimeter of circle : "+c.calcPerimeter_circle());
    }
}
