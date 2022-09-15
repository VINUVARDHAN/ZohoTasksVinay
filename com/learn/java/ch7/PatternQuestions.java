package com.learn.java.ch7;

import java.util.Scanner;

public class PatternQuestions {
	public static void main(String[] args) {
        pattern8();
    }
    public static void pattern1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        for (int i=1;i<=number;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
    public static void pattern2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        for (int i=1;i<=number;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
    public static void pattern3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        System.out.println("enter the increment value :");
        int order = sc.nextInt();
        for (int i=1;i<=number;i++)
        {
            int k=1;
            for (int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k +=order;
            }
            System.out.println("");
        }
        sc.close();
    }
    public static void pattern4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            for (int j=1;j<=number-i;j++)
            System.out.print("  ");
            for (int k=1;k<=i;k++)
            System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
    public static void pattern5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<number;j++)
            {
                if ((j+i)>=(number-1))
                    System.out.print((j+1)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void pattern6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        String arr[][] = new String[number][number];
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<=i;j++)
                arr[i][j] = String.valueOf(j+1);
            for (int j=i+1;j<number;j++)
                arr[i][j] = " ";
        }
        for (int i=0;i<number;i++)
        {
            for (int j=number-1;j>=0;j--)
                System.out.print(arr[i][j]+" ");
            for (int k=0;k<number;k++)
                System.out.print(arr[i][k]+" ");
            System.out.println();
        }
        sc.close();
    }
    public static void pattern7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        String arr[][] = new String[number][number];
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<=i;j++)
                arr[i][j] = String.valueOf(j+1);
            for (int j=i+1;j<number;j++)
                arr[i][j] = " ";
        }
        for (int i=0;i<number;i++)
        {
            for (int k=0;k<number;k++)
                System.out.print(arr[i][k]+" ");
            System.out.println();
        }
        for(int i=number-2;i>=0;i--)
        {
            for(int k=0;k<number;k++)
                System.out.print(arr[i][k]+" ");
            System.out.println();
        }
        sc.close();
    }
    public static void pattern8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for pattern :");
        int number = sc.nextInt();
        System.out.println("enter the order of increment :");
        int order = sc.nextInt();
        String arr[][] = new String[number][number];
        for (int i=0;i<number;i++)
        {
            int k=1;
            for (int j=0;j<=i;j++)
            {
                arr[i][j] = String.valueOf(k);
                k += order;
            }
            for (int j=i+1;j<number;j++)
                arr[i][j] = " ";
        }
        for (int i=0;i<number;i++)
        {
            for (int j=number-1;j>=0;j--)
                System.out.print(arr[i][j]+" ");
            for (int k=0;k<number;k++)
                System.out.print(arr[i][k]+" ");
            System.out.println();
        }
        for(int i=number-2;i>=0;i--)
        {
            for (int j=number-1;j>=0;j--)
                System.out.print(arr[i][j]+" ");
            for(int k=0;k<number;k++)
                System.out.print(arr[i][k]+" ");
            System.out.println();
        }
        sc.close();
    }
}
