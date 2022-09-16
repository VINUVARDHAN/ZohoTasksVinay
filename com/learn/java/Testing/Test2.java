package com.learn.java.Testing;
public class Test2{
	public static void main(String args[])
	{
		C1 c = new C1(10);
		C1 v = c;
		c.a = 20;
		System.out.println(v.a);
		
	}
}

class C1{
	int a;
	C1(int a)
	{
		this.a = a;
	}
}