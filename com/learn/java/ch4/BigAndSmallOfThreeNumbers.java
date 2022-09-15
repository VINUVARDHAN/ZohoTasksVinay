package com.learn.java.ch4;

public class BigAndSmallOfThreeNumbers {
	public static void main(String args[])
	{
		System.out.println(Math.max(Math.max(10, 20), 30)+" : max of 3 numbers");
		System.out.print(Math.min((Math.min(10, 20)), 30)+" : min of 3 numbers");
	}
}
