package com.learn.java.ch8;
import java.util.*;
public class FindAndReplaceACharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string value");
        String s1 = sc.nextLine();
        String s2 = "";
        System.out.println("enter the character to replace");
        char find = sc.next().charAt(0);
        System.out.println("enter the replacing character :");
        char replace = sc.next().charAt(0);
        int len = s1.length();
        for(int i=0;i<len;i++) 
        {
            if(s1.charAt(i)==find)
            {
                s2 += replace;
            }
            else{
                s2 += s1.charAt(i);
            }
        }
        System.out.println(s2);
        sc.close();
    }
}
