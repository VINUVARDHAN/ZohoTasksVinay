package com.learn.java.Sep16;

public class ObjectReference {
    public static void main(String[] args) {
        Class1 a = new Class1();
        Class1 b = new Class1();
        //two objects are created and referenced to different location
        if(a==b)
        {
        	System.out.println("a is equal to b");
        }
        else
        {
        	System.out.println("a is not equal to b");
        }
        // class c is referenced to 'a' class 
        Class1 c = a;
        if(a==c)
        {
        	System.out.println("a is equal to c");
        }
        else
        {
        	System.out.println("a is not equal to c");
        }
        System.out.println("after a=null");
        a = null;
        if(a==c)
        {
        	System.out.println("a is equal to c");
        }
        else
        {
        	System.out.println("a is not equal to c");
        }
        c = null;
        System.gc();
    }
}
class Class1{
    void method1()
    {
        System.out.println("method()");
    }
    protected void finalize()
    {
    	System.out.println("garbage collection calling finalize method in Class1");
    }
}