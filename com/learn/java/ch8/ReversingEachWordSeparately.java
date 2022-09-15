package com.learn.java.ch8;

import java.util.Scanner;

public class ReversingEachWordSeparately {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the sentance");
    String sent = sc.nextLine();
    String word[] = sent.split(" ");
    for(String i:word)
    {
        String val = "";
        int len  = i.length();
        for(int j=len-1;j>=0;j--)
        {
            val +=i.charAt(j);
        }
        System.out.print(val+" ");
    }
    sc.close();
}
}
