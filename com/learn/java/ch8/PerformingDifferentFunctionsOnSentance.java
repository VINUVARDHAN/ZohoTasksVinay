package com.learn.java.ch8;

import java.util.Scanner;

public class PerformingDifferentFunctionsOnSentance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentance ");
        String sent = sc.nextLine();
        String[] words = sent.split(" ");
        int wordsCount = words.length;
        int characterCount = 0;
        int vowelsCount = 0;
        int numberCount = 0;
        int specialCount = 0;
        for(String i:words)
        {
            int len = i.length();
            for(int j=0;j<len;j++)
            {
                char c = i.charAt(j);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                {
                    vowelsCount ++;
                }
                else if(c>='A' && c<='z' || c>='a' && c<='z')
                {
                    characterCount ++;
                }
                else if(c>='0' && c<='9' )
                {
                    numberCount ++;
                }
                else{
                    specialCount++;
                }
            }
        }
        System.out.println("words count : "+wordsCount);
        System.out.println("vowels count : "+vowelsCount);
        System.out.println("consonants count : "+characterCount);
        System.out.println("number count : "+numberCount);
        System.out.println("special character count : "+specialCount);
        sc.close();
    }
}
