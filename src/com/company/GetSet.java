package com.company;

class MyEmployee{
    private int empId;
    private String empName;

    public int getId(){
        return empId;
    }
    public void setId(int id){
        this.empId = id;
    }

    public String getName(){
        return empName;
    }
    public void setName(String name){
        empName = name;
    }
}

class MyCircle{
    private int radius;
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public float getPerimeter(){
        return 2*3.14f*radius;
    }
}
public class GetSet {
    static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        emp.setId(916);
        System.out.println(emp.getId());
        emp.setName("Isha");
        System.out.println(emp.getName());

        MyCircle mc = new MyCircle();
        mc.setRadius(4);
        System.out.println(mc.getArea());
        System.out.println(mc.getPerimeter());
    }
}
