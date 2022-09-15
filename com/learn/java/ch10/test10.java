package com.learn.java.ch10;
import com.learn.java.ch11.*;
public class test10 extends test11{
	static int a = 10;
	int b = 20;
	public static void main(String args[])
	{
		test11 hi = new test11();
		hi.delete();
		a = 20;
		Class1 c= new Class1();
		c.m1Set(20);
		int b = c.m1get();
		System.out.println(b);
		c.m1Set(90);
		System.out.println(c.m1get());
	}
}
class Class1{
	private int a = 10;
	void m1Set(int v)
	{
		this.a = v;
	}
	int m1get()
	{
		return this.a;
	}
}
