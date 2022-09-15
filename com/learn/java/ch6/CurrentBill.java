package com.learn.java.ch6;
import java.util.Scanner;
public class CurrentBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the power in units : ");
        double unit = sc.nextDouble();
        double amount=0;
        if (unit>1000)
        {
        amount +=(unit-1000)*7;
        unit =1000;
        }
        if (unit>500 && unit<=1000)
        {
        amount +=(unit-500)*5;
        unit =500;
        }
        if (unit>300 && unit<=500)
        {
        amount +=(unit-300)*3;
        unit =300;
        }
        if (unit >100 && unit<=300)
        {
        amount +=(unit-100)*2.50;
        unit =100;
        }
        sc.close();
        System.out.println(amount);
    }
}
