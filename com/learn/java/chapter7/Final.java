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
	
    private final static int STATICVARIABLE;
    
    //we can initialize the value of final variable inside the constructor
    
    private final int NONSTATICVARIABLE;
    A()
    {
    	NONSTATICVARIABLE = 10; 
        System.out.println("non parameterized constructor");
    }
    A(final int val)
    {
    	NONSTATICVARIABLE=10;
    	System.out.println("parameterized constructor");
    }
    //you need to initialize the value for final keyword in each constructor
    //A(int i){}
    static{
    	STATICVARIABLE = 20;
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