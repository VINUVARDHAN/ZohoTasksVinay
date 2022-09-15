package com.learn.java.ch6;

import java.util.Scanner;

public class BigAndSmallOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int f = sc.nextInt();
        System.out.println("enter second number :");
        int s = sc.nextInt();
        System.out.println("enter third number :");
        int t = sc.nextInt();
        int big = Math.max(Math.max(f, s), t);
        int small = Math.min(f, Math.min(s, t));
        System.out.println("bigger number is : "+big+"\n"+"smaller number is : "+small);
        sc.close();
    }
}
