package com.learn.java.chapter7;

public class Static {
	static int a = 10;
	//b can't access inside static method
	int b = 20;
	static{
		System.out.println("static block");
	}
	Static(){
		System.out.println("constructor");
	}
	static void m()
	{
		System.out.println(a+"   method m");
		a++;
	}
	public static void main(String[] args) {
		Static s = new Static();
		System.out.println(a);
		System.out.println();
		m();
		m();
	}

}

