package com.learn.java.ch8;

import java.util.*;

public class StringInAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        char a[] = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i] = s.charAt(i);
        }
        for(int i=0;i<a.length-1;i++)
                {
                    for(int j=i+1;j<a.length;j++)
                    {
                        if (a[i]>a[j])
                        {
                            char temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
        String c="";
        for(int i=0;i<a.length;i++)
        {
        	c +=a[i];
        }
        System.out.print(c);
        sc.close();
    }
}
