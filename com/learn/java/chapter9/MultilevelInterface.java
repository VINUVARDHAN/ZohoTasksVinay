package com.learn.java.chapter9;

public class MultilevelInterface{

	
	public static void main(String args[])
	{
		/**
		 * 1. this mean that you can access the implementations of 
		 * class name (Class) using the interface reference 
		 * variable "i" using below method
		 * 2. can use variable of interface but no change
		 * 
		 */
		
		//111111
		InterF2 i = new Class1();
		i.method();
		//222222
		new Class1().m();
		i.method();
	}
}
interface InterF1{
	void method1OfIF1();
	void method();
	static void m() {
		System.out.println("m method in IF1");
	}
}
interface InterF2 extends InterF1{
	int i=0;
	void method1OfIF2();
	void method();
}

class Class1 implements InterF2{
	public void method1OfIF2(){
		System.out.println("class1");
	}
	public void method()
	{
		System.out.println("class1");
	}
	public void m()
	{
		System.out.println("class1");
	}
	public void method1OfIF1()
	{
		System.out.println("class1");
	}
}
