package com.learn.java.C8_AbstractClassInheritance;

class AbstractClass2 {
	public static void main(String args[])
	{
		/**
		 * In abstract class also you can call the static members 
		 * without class reference variable
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