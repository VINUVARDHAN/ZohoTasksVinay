package com.learn.java.ch4;
import java.util.*;
public class CheckOddOrEven {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		if (n%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
		sc.close();
	}
}
