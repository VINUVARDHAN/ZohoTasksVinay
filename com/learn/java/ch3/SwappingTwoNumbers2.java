package com.learn.java.ch3;

public class SwappingTwoNumbers2 {
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.print("a : "+a+"\nb : "+b);
	}
}
