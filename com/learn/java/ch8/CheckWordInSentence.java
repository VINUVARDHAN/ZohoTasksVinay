package com.learn.java.ch8;
import java.util.*;
public class CheckWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter scentance");
        String s = sc.nextLine();
        System.out.println("enter the word : ");
        String w = sc.nextLine();
        int lenS = s.length();
        int lenW = w.length();
        int val=0;
        for(int i=0;i<lenS-lenW;i++)
        {
            int count=0;
            for(int j=0;j<lenW;j++)
            {
                if(s.charAt(i+j)==w.charAt(j))
                {
                    count++;
                }
            }
            if(count==w.length())
            {
                val = 1;
                System.out.println("word found in sentance");
                break;
            }
        }
        if(val==0)
        {
            System.out.println("not found");
        }
        sc.close();
    }
}
