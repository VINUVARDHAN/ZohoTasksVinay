package com.learn.java.ch4;

import java.util.Scanner;

public class DenominationToAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notes[] = {2000,500,200,100,50};
        int count[] = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println(notes[i] + " : " );
            count[i] = sc.nextInt();
        }
        int total=0;
        for (int i=0;i<5;i++)
        {
            total +=count[i]*notes[i];
        }
        System.out.println("the total amount is : "+total);
        sc.close();
    }
}
