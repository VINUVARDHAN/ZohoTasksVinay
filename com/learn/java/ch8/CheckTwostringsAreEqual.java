package com.learn.java.ch8;

import java.util.Scanner;

public class CheckTwostringsAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("string 1 :");
        String s1 = sc.nextLine();
        System.out.println("string 2 :");
        String s2 = sc.nextLine();
        if(s1.length()==s2.length())
        {
            int count=0;
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                {
                    count++;
                }
            }
            if(count==s1.length())
            {
                System.out.println("strings are equal");
            }
            else
            {
                System.out.println("..two strings are not equal");
            }
        }
        else
        {
            System.out.println("two strings are not equal");
        }
        sc.close();
    }
}
