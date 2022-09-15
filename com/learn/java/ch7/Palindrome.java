package com.learn.java.ch7;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number  = sc.nextInt();
        String Number = String.valueOf(number);
        int length = Number.length();
        int count = 0;
        for(int i=0,j=length-1;i<length/2;i++,j--)
        {
            if(Number.charAt(i)==Number.charAt(j))
            count++;
        }
        if(count==length/2)
        System.out.println("the number is palindrome");
        else
        System.out.println("the number is not palindrome");
        sc.close();
    }
}
