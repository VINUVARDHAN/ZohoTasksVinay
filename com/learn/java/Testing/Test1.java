package com.learn.java.Testing;

public class Test1{
	public static void main(String [] s)
	{
		System.out.println("hi");
		Class1 c = new Class1();
		
	}
}
class Class1{
	int a = 10;
	static int b = 20;
	protected Class1()
	{
		System.out.println("no parameter constructor");
		a =  10;
		b = 20;
		m1();
	}
	static void m1()
	{
		System.out.println("static method");
		b = 20;
	}
}