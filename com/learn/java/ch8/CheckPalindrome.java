package com.learn.java.ch8;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        String number  = sc.nextLine();
        int length = number.length();
        int count = 0;
        for(int i=0,j=length-1;i<length/2;i++,j--)
        {
            if(number.charAt(i)==number.charAt(j))
            count++;
        }
        if(count==length/2)
        System.out.println("the string is palindrome");
        else
        System.out.println("the string is not palindrome");
        sc.close();
    }
}
