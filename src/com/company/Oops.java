package com.company;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Oops  {
    static void main(String[] args) {
        Employee isha = new Employee();
        isha.id = 21;
        isha.name = "HeyThere";
        isha.salary = 25000;
        isha.printDetails();
        int sal = isha.getSalary();
        System.out.println("Salary = "+sal);
    }
}
