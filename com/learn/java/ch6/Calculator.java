package com.learn.java.ch6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int a = sc.nextInt();
        System.out.println("enter second number : ");
        int b = sc.nextInt();
        System.out.println("enter the operator sign : ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':System.out.println("addition : "+(a+b));
            break;
            case '-':System.out.println("subtraction : "+(a-b));
            break;
            case '*':System.out.println("multiplication : "+(a*b));
            break;
            case '/':System.out.println("division : "+(a/b));
            break;
            case '%':System.out.println("reminder : "+(a%b));
            break;
        }
        sc.close();
    }
}
