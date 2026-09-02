package com.oops.utils;

public class TestClass {
    static void main() {
        Employee emp = new Employee();
        emp.setId(2488916);
        emp.setName("Isha Kumari");
        emp.setAge(22);
        emp.setSalary(25000);
        //emp.displayEmployeeDetails();

        Circle c = new Circle(3);
        System.out.println("Area of circle is "+c.calculateArea());

        Square s = new Square(4);
        System.out.println("Area of square is "+s.calculateArea());
    }
}
