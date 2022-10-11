package com.learn.java.chapter10;

public class test {
	public static void main(String args[])
	{
		try {
			int a[] = new int[20];
			a[30]  = 40;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
