package com.learn.java.ch4;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
    	SimpleInterest();
    }
    public static void SimpleInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("principal : ");
        float principal = sc.nextFloat();
        System.out.println("rateOfInterest : ");
        float rateOfInterest = sc.nextFloat();
        System.out.println("days : ");
        int days = sc.nextInt();
        System.out.println("simple interest : "+(principal*rateOfInterest*days/100)/365);
        sc.close();
    }
}