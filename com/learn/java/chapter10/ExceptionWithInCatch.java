package com.learn.java.chapter10;

public class ExceptionWithInCatch {
	public static void main(String []args)
	{
		try {
			int a=50/0;
		}
		catch(ArithmeticException e)
		{
			try {
				int b = 50/0;
			}
			catch(ArithmeticException f)
			{
				System.out.println(e);
			}
		}
	}
}
//catch itself may contain exception so try can be used in catch also