package com.learn.java.chapter9;

public class MultilevelInterface{

	
	public static void main(String args[])
	{
		/**
		 * We can access only the corresponding implementations of 
		 * interface
		 */
		
		//i1 can access only one method
		InterF1 i1 = new Class();
		i1.methodOfIF1();
		//i2 can access only two method
		InterF2 i2 = new Class();
		i2.methodOfIF1();
		i2.methodOfIF2();
		//i3 can access only three method
		InterF3 i3 = new Class();
		i3.methodOfIF1();
		i3.methodOfIF2();
		i3.methodOfIF3();
	}
}
interface InterF1{
	void methodOfIF1();
	}
interface InterF2 extends InterF1{
	void methodOfIF2();
}
interface InterF3 extends InterF2{
	void methodOfIF3();
}
//Body of method also require for the methods in parent interface
class Class implements InterF3{
	public void methodOfIF3()
	{
		System.out.println("Interface 3");
	}
	public void methodOfIF2()
	{
		System.out.println("Interface 2");
	}
	public void methodOfIF1()
	{
		System.out.println("Interface 1");
	}
}