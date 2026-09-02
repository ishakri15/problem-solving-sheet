package com.oops.utils;

public class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    void displayEmployeeDetails(){
        System.out.println("Employee id : "+this.id);
        System.out.println("Employee name : "+this.name);
        System.out.println("Employee age : "+this.age);
        System.out.println("Employee salary : "+this.salary);
    }
}
