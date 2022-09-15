package com.learn.java.ch8;

import java.util.Scanner;

public class StringLowerToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string value");
        String s1 = sc.nextLine();
        String s2 = "";
        int len = s1.length();
        for(int i=0;i<len;i++)
        {
            char c = s1.charAt(i);
            s2 +=Character.toUpperCase(c);
        }
        System.out.println(s2);
        sc.close();
    }
}
