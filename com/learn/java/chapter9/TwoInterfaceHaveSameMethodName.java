package com.learn.java.chapter9;

/**
 *  If two interface have same method name then the implementation 
 *  will be similar to both of them
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
	@Override
	public void method1() {
		// TODO Auto-generated method stub
	}
}
interface InterfaceA{
	void method();
	default void method1()
	{
		System.out.println("method 1");
	}
}
interface InterfaceB{
	void method();
	default void method1()
	{
		System.out.println("method 1");
	}
}