package com.learn.java.chapter7;

public class StaticKeyword {
	//static variables
	static int a = 10;
	//b can't access inside static method
	int b = 20;
	//static blocks
	static{
		System.out.println("static block");
	}
	StaticKeyword(){
		System.out.println("constructor");
	}
	//static method
	static void m()
	{
		System.out.println("method m");
	}
	public static void main(String[] args) {
		StaticKeyword s1 = new StaticKeyword();
		System.out.println(a);
		m();
		//we can call the static methods without creating the object
		StaticClass2.call();
	}
	//static nested class 

}

//Another class
class StaticClass2{
	static void call()
	{
		System.out.println("static method of Static class");
	}
}

