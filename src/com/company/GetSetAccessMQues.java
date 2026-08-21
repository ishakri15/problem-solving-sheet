package com.company;

//Problem 1,2,3
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int rd, int ht){
        this.radius = rd;
        this.height = ht;
    }

    /*public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        this.height = h;
    }*/

    public float getSurfaceArea(){
        return 2*3.14f*radius*(height+radius);
    }

    public float getVolume(){
        return 3.14f*radius*radius*height;
    }
}

//Problem 4
class Rec{
    private int length;
    private int breadth;

    public Rec(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rec(int len, int bdt){
        this.length = len;
        this.breadth = bdt;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

//Problem 5
class Sphere{
    private int radius;

    public Sphere(int r){
        this.radius = r;
    }

    /*public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }*/

    public float getVolume(){
        return (float)(4/3)*3.14f*radius*radius*radius;
    }

    public float getSurfaceArea(){
        return 4*3.14f*radius*radius;
    }
}
public class GetSetAccessMQues {
    static void main(String[] args) {

        //Problem 1,2,3
        Cylinder cy = new Cylinder(4,6);
        /*cy.setRadius(4);
        cy.setHeight(7);*/
        System.out.println("Surface area : "+cy.getSurfaceArea());
        System.out.println("Volume : "+cy.getVolume());
        System.out.println();

        //Problem 4
        Rec r = new Rec(12,8);
        System.out.println("Length : "+r.getLength());
        System.out.println("Breadth : "+r.getBreadth());
        System.out.println();

        //Problem 5
        Sphere sp = new Sphere(3);
        //sp.setRadius(3);
        System.out.println("Volume : "+sp.getVolume());
        System.out.println("Surface area : "+sp.getSurfaceArea());
    }
}
