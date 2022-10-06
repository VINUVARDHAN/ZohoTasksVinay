package com.learn.java.chapter9;
public class Interface implements Example2{
    public static void main(String[] args) {
    	Example ex = new Interface();
        ex.method();
        ex.method(10);
        Example2 ex1 = new Interface();
        ex1.method();
        ex1.method(10);
    }
    public void method()
    {
    	System.out.println("method without parameter");
    }
    public void method(int i)
    {
    	System.out.println("method with parameter");
    }
}

 interface Example{
	int i = 10;
	/**
	 * no constructor
	 * no static block / {}
	 */
	
	//overloading
	void method();
	void method(int i);
	
}
 interface Example2 extends Example{
	 //overriding
	 void method();
 }