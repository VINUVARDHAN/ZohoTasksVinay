package com.learn.java.ch7;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check prime or not");
        int n = sc.nextInt();
        int count=0;
        if(n<=1)
        {
            System.out.println("enter the vaild number");
        }
        else{
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    break;
                }
                count++;
            }
            if(count==(n-2))
            {
                System.out.println(n+" is prime number");
            }
            else
            {
                System.out.println(n+" is not a prime number");
            }
        }
        sc.close();
    }
}
