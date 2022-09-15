package com.learn.java.ch11;

import java.util.Scanner;

public class OverLoading {
    static void addNum(int a,int b)
    {
        System.out.println("Sum of two numbers is : "+(a+b));
    }
    static void addStrings(String a,String b)
    {
        System.out.println("Concatination of two Strings is : "+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to add two numbers type 1\nIf you want to concat two strings type 2");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            addNum(a, b);
            break;
            case 2:System.out.println("Enter two strings : ");
            String x = sc.next();
            String y = sc.next();
            addStrings(x, y);
            break;
            default:
            System.out.println("Entered invalid value");
        }
        sc.close();
    }
}