package com.learn.java.chapter10;
import java.io.*;  

public class Throws {
	public static void main(String args[]) {
		try
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
	static void method() throws FileNotFoundException{
		FileReader file = new FileReader("Users\\vinays\\Desktop\\abc.txt");  
  	}
}
