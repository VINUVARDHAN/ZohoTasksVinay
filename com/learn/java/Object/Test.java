package com.learn.java.Object;

import java.util.List;

public class Test {
	public static void main(String args[])
	{
		Object obj = new Object();
		Integer integer = new Integer(null);
		A a = new A();
		A a1 = new B();
		B b = new B();
		b.method(b);
		//tostring
		a.toString();			
		};
	}
class A{
	void method(A b)
	{
		System.out.println("object method    ");
	}
	void method(int i)
	{
		System.out.println("integer method");
	}
}

class B extends A{
	void methodb()
	{

	}
}