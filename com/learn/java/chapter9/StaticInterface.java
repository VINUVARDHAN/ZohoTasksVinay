package com.learn.java.chapter9;

class StaticInterface {
	public static void main(String args[])
	{
		OuterIF.InnerIF oi1 = new Class1();
		oi1.method();
		OuterIF.InnerIF oi2 = new Class2();
		oi2.method();
		oi1.method();
	}
}

class Class1 implements OuterIF.InnerIF{
	public void method()
	{
		System.out.println("Implemented in Class C1");
	}
}
class Class2 implements OuterIF.InnerIF{
	public void method()
	{
		System.out.println("Implemented in Class CZ");
	}
}

interface OuterIF{
	static interface InnerIF{
		void method();
	}
}