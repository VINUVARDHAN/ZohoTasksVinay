package com.learn.java.ch8;
import java.util.Scanner;
public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string value");
        String s1 = sc.nextLine();
        String s2 = "";
        int len = s1.length();
        for(int i=len-1;i>=0;i--)
        {
            s2 +=s1.charAt(i);
        }
        System.out.println(s2);
        sc.close();
    }
}
