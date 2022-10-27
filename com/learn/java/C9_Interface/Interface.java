package com.learn.java.C9_Interface;

class Interface implements Example2{
    public static void main(String[] args) {
    	Example ex = new Interface();
    	//Example for overloading
        ex.method();
        ex.method(10);
    }
    public void method()
    {
    	System.out.println("Method without parameter");
    }
    public void method(int i)
    {
    	System.out.println("Method with parameter");
    }
}

  interface Example{
	
	/**
	 * Need to initialize variables 
	 * at the time of declaration because in interface
	 * we can't use blocks, constructor and also by default 
	 * they will be static and final
	 */
	 static final byte VAL  = 10;
	  
	//Overloading
	void method();
	void method(int i);
	
	//Static method require body
	static void staticMethod()
	{
		System.out.println("Static method");
	}
	
	//Default method require body
	 default void defaultMethod()
	{
		System.out.println("Default method ");
	}
}
 interface Example2 extends Example{
	 //Overriding 
	 void method();
 }