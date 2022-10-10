package com.learn.java.chapter9;

/**
 *  For two different interfaces having same method name implemented in single class 
 *  will be having single method body 
 */

public class TwoInterfaceHaveSameMethodName implements InterfaceA,InterfaceB{
	public static void main(String args[])
	{
		InterfaceA a = new TwoInterfaceHaveSameMethodName();
		a.method();
		InterfaceB b = new TwoInterfaceHaveSameMethodName();
		b.method();
	}
	public void method()
	{
		System.out.println("method");
	}
}
interface InterfaceA{
	void method();
}
interface InterfaceB{
	void method();
}
