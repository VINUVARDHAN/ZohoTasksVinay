package com.learn.java.chapter7;

public class Final {
    static private int i=0;
    public static void main(String[] args) {
        //you can't change the reference of object
        final A a = new B();
        //a = new B();
    }
}
class A{
    //we can only use the static block to initialize the static final keywords
    final static int j;
    //we can also initialize the value of final variable inside the cnstructor
    final int i;
    A()
    {
        i = 10; 
    }
    //you need to initialize the value for final keyword in each constructor
    //A(int i){}
    static{
        j = 20;
    }
    final void m()
    {

    }
}
class B extends A{
    
}