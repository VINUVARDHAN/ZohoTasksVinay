package com.learn.java.ch4;

import java.util.Scanner;

public class CentimeterToReadFormat {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number in cm : ");
        int value = sc.nextInt();
        int reducingValue = 0;
        if (value>=10000)
        {
            reducingValue = value%10000;
            value = value - reducingValue;
            System.out.println("kilometer : "+value/10000);
            value = reducingValue;
        }
        if (value>=100)
        {
        	reducingValue = value%100;
            value = value - reducingValue;
            System.out.println("kilometer : "+value/100);
            value = reducingValue;
        }
        if (value>=30)
        {
        	reducingValue = value%30;
            value = value - reducingValue;
            System.out.println("feet : "+value/30);
            value = reducingValue;
        }
        if (value>=1)
        {
        	System.out.println("cm : "+value);
        }
        sc.close();
    }
}
