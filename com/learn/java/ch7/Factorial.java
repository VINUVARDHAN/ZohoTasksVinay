package com.learn.java.ch7;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number :");
    int n = sc.nextInt();
    int total = 1;
    for (int i=n;i>=1;i--)
    {
        total *=i;
    }
    System.out.println(total);
    sc.close();
}
}
