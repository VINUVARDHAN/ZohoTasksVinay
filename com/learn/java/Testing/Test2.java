package com.learn.java.Testing;
class GParent{
    GParent(){
        System.out.println("G Parent constructor ");
    }
    void mg1()
    {
        System.out.println("method mg1");
    }
    void mg2()
    {
        System.out.println("method mg2");
    }
    void mg()
    {
        System.out.println("method mg");
    }
}
class Parent extends GParent{
    Parent(){
        System.out.println("Parent Class constructor");
    }
    void p1()
    {
        System.out.println("method p1");
    }
    void p2()
    {
        System.out.println("method p2");
    }
    void p()
    {
        System.out.println("method p");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Class constructor");
    }
    void c1()
    {
        System.out.println("method c1");
    }
    void c2()
    {
        System.out.println("method c2");
    }
    void c()
    {
        System.out.println("method c");
    }
}

public class Test2{
    public static void main(String[] args) {
        Child c = new Child();
    }
}