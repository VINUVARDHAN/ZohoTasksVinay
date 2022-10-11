package com.learn.java.chapter10;

public class ExecutionTillException {
	public static void main(String args[])
	{
		try {
			int a=50/0;
			System.out.println("Statement not executed");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
//Rest of the statements won't execute once exception is triggered