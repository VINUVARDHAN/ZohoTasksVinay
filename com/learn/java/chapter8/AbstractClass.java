package com.learn.java.chapter8;

class AbstractClass{
	public static void main(String args[])
	{
		/**
		 * we cannot create a object for abstract class
		 * A s = new A();
		 */
		
		
		//but A's reference variable 'a' can be initialized with extended classes of A that is B and C
		A a = new B();
		a.method();
		
		
		C c = new C();
		c.method();
	}
}
abstract class A{
	/**
	 * Abstract class can also have 
	 * constructor,
	 * blocks
	 */
	  abstract void method();
}
class B extends A{
	//Require method declaration for all the methods in Abstract parent class in child class
	void method()
	{
 		System.out.println("class B extends A");
	}
}
class C extends A{
     void method()
	{
		System.out.println("class C extends A");
	}
}
//Grand child class of abstract class can or cannot have the method body
class D extends B{
	
}