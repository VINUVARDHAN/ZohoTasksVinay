package com.learn.java.chapter8;

public class AbstractClass{
	public static void main(String args[])
	{
		/**
		 * we cannot create a object for abstract class
		 * A s = new A();
		 */
		
		
		//but A's reference variable can initiate with the extended classes of A that is B and C
		A a = new B();
		a.method();
		
		
		C c = new C();
		c.method();
	}
}
abstract class A{
	abstract void method();
}
class B extends A{
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
