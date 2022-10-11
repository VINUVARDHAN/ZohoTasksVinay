package com.learn.java.chapter10;

public class ExceptionOrder {
	public static void main(String args[])
	{
		try {
			int a=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}
	}
}


//If the order is varied you will get error but you can remove anyone