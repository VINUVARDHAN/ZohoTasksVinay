package com.learn.java.ch7;
import java.util.*;
public class BiggestAndSmallestOfNNumbers {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of array :");
    int size = sc.nextInt();
    int [] a;
    a = new int[size];
    for(int i=0;i<size;i++)
    {
        a[i]=sc.nextInt();
    }
    if (size>0){
        int min = a[0];
        int max = a[0];
        for(int i=0;i<size;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("max number is : "+max);
        System.out.println("min number is : "+min);
    }
    else {
    	System.out.println("enter the array size greater than 0");
    }
    sc.close();
}
}
