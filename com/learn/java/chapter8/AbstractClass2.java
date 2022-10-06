package com.learn.java.chapter8;



public class AbstractClass2 {
	public static void main(String args[])
	{
		/**
		 * you can call the static members of the abstract class without object reference 
         * but you can't call the non static members .
		 */
		ParentClass.method1();
	    int b = ParentClass.a;
	}
}

abstract class ParentClass{
	static int a = 10;
	static void method1(){
	System.out.println("static method");
	}
}