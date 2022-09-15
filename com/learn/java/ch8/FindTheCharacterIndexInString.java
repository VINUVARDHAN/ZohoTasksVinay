package com.learn.java.ch8;
import java.util.*;
public class FindTheCharacterIndexInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string value");
        String s = sc.nextLine();
        System.out.println("enter the character : ");
        char c = sc.next().charAt(0);
        System.out.println("enter the start location :");
        int start = sc.nextInt();
        int len = s.length();
        int val=0;
        for(int i=start;i<len;i++)
        {
            if(s.charAt(i)==c)
            {
                System.out.println("the position of character is : "+i);
                val = 1;
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
