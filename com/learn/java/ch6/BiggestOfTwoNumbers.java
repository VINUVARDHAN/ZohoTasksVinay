package com.learn.java.ch6;

import java.util.Scanner;

public class BiggestOfTwoNumbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int fNumber  = sc.nextInt();
        System.out.println("enter second number :");
        int sNumber = sc.nextInt();
        if (fNumber>sNumber)
        {
            System.out.println(fNumber+" : is bigger than :"+sNumber);
        }
        else if(fNumber==sNumber)
        {
        	System.out.print("both are same");
        }
        else
        {
            System.out.println(sNumber+" : is bigger than :"+fNumber);
        }
        sc.close();
    }
}
