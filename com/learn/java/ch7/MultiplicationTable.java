package com.learn.java.ch7;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number for which table you want : ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(i*n));
        }
        sc.close();
    }
}
