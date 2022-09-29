package com.learn.java.extra;

public class SuperAndThis {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A {
    protected A()
    {
        System.out.println("constructor A");
    }
    A(int a)
    {
        this();
        System.out.println("constructor A with parameter");
    }
}
class B extends A{
    B()
    {
        super(8236);
        System.out.println("constructor B");
    }
}