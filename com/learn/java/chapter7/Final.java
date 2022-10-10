package com.learn.java.chapter7;

public class Final {
    static private int i=0;
    public static void main(String[] args) {
        //you can't change the reference of object
    	//only final is permitted
         final A OBJECTNAME = new A();
        //OBJECTNAME = new B();
    }
}
class A{
    //we can only use the static block to initialize the values to static final variables
	
    private final static int STATIC_VARIABLE;
    
    //we can initialize the value of final variable inside all the constructor
    
    private final int NON_STATIC_VARIABLE;
    A()
    {
    	NON_STATIC_VARIABLE = 10; 
        System.out.println("non parameterized constructor");
    }
    A(final int val)
    {
    	NON_STATIC_VARIABLE=10;
    	System.out.println("parameterized constructor");
    }
    //you need to initialize the value of final keyword in each constructor
    //A(int i){}
    static{
    	STATIC_VARIABLE = 20;
    }
    final void method()
    {
    	System.out.println("method");
    }
}
class B extends A{
	/**
	 * cannot override the final methods
	 */
    //void method() {}
}