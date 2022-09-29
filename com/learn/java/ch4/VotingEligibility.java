package com.learn.java.ch4;
import java.util.*;
public class VotingEligibility {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		String name = sc.nextLine();
		System.out.println("gender: ");
		//char gender = sc.next().charAt(0);
		System.out.println("age: ");
		short age = sc.nextShort();
		if (age<18)
		{
			System.out.print(name + " is not eligible to vote");
		}
		else
		{
			System.out.print(name + "is eligible to vote");
		}
		sc.close();
	}
}
