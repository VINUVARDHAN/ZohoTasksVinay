package com.learn.java.ch7;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ending range");
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        for(;b<n;)
        {
        	System.out.print(b+" ");
            int temp = a;
            a = b;
            b = temp + a;
        }
        sc.close();
    }
}
