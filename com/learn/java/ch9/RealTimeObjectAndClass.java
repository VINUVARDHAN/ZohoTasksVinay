package com.learn.java.ch9;

public class RealTimeObjectAndClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20, 30);
        rect.volume();
        rect.area();
    }
}
class Rectangle
{
    int length;
    int width;
    int height;
    Rectangle(int l,int w,int h)
    {
        this.length = l;
        this.width = w;
        this.height = h;
    }
    void volume()
    {
        System.out.print("volume : ");
        System.out.println(this.length*this.width*this.height);
    }
    void area()
    {
        System.out.print("area : ");
        System.out.println(this.length*this.width);
    }
}