package com.learn.java.ch6;

import java.util.Scanner;

public class CheckCharcterUpperOrLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character : ");
        char c = sc.next().charAt(0);
        if(Character.isUpperCase(c))
        {
            System.out.println("character is in uppercase");
        }
        else
        {
            System.out.println("character is in lowercase");
        }
        sc.close();
    }
}
