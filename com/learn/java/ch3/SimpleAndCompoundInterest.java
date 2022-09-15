package com.learn.java.ch3;

public class SimpleAndCompoundInterest {
	public static void main(String args[])
	{
		double amount = 1000,rate = 0.20,time = 3;
		double simpleInterest = amount * rate * time ;
		double compoundInterest = amount*Math.pow(1+rate,time)-amount;
		System.out.println(simpleInterest + " : simple interest");
		System.out.print(compoundInterest + " : compound interest");
	}
}
