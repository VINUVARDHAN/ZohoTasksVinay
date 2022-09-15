package com.learn.java.ch3;

public class TypeCasting {
	public static void main(String args[])
	{
		//byte to int
		int a = 10;
		//int to byte
		byte b =(byte) 128;
		//int to float
		float c = a;
		//float to int
		a =(int) c;
		//int to long
		long d = a;
		//long to int
		a = (int) 635467656;
		//float to double 
		double e = c;
		//double to float
		c =(float) e;
		//int to double
		e = a;
		//double to int
		a =(int) e;
		//char to int 
		a = 'a';
		//int to char
		char f = 98;
		//int to boolean
		//boolean g = (bool)10;
		//boolean to int
		//a = g;
		//char to string
		String h = String.valueOf(f);
		//string to char
		f =h.charAt(0);
	}
}
