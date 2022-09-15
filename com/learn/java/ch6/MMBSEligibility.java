package com.learn.java.ch6;

import java.util.Scanner;

public class MMBSEligibility {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the rank obtained in MBBS :");
        int rank = sc.nextInt();
        if (rank<=15000)
        {
            System.out.println("you are eligible for MBBS ");
        }
        else
        {
            System.out.println("you are not eligible for MBBS ");
        }
        sc.close();
    }
}
