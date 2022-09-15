package com.learn.java.ch10;

public class SuperAndFinal {
    public static void main(String[] args) {
        new Circle(3);
        new Rectangle(2, 3);
    }
}
class Area{
    double area;
    final float pi = 3.142f;
    //using over loading constructor to calculate the area of circle and rectangle
    
    //This if for circle
    Area(float radius)
    {
        area = pi * Math.pow(radius, 2);
        System.out.println("Area of circle is : "+area);
    }
    //This if for rectangle
    Area(float height,float length)
    {
        area = height * length;
        System.out.println("Area of rectangle is : "+area);
    }
} 
//super class is used 
class Circle extends Area{
    Circle(float radius)
    {
        super(radius);
    }
}

class Rectangle extends Area{
    Rectangle(float height,float length)
    {
        super(height, length);
    }
}