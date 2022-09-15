package com.learn.java.ch8;
import java.util.Scanner;

    public class Check2ArraysAreEqualOrNot {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the details of first array");
        System.out.println("enter the size of row : ");
        int row1 = sc.nextInt();
        System.out.println("enter the size of column : ");
        int col1 = sc.nextInt();
        System.out.println("enter the values : ");
        int arr1[][] = new int[row1][col1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the details of second array");
        System.out.println("enter the size of row : ");
        int row2 = sc.nextInt();
        System.out.println("enter the size of column : ");
        int col2 = sc.nextInt();
        System.out.println("enter the values : ");
        int arr2[][] = new int[row2][col2];
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        compare(arr1,arr2);
        sc.close();
    }
    public static void compare(int[][] arr1,int[][]arr2)
    {
        if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
        {
            int col = arr1[0].length;
            int row = arr1.length;
            int totalValues = col*row;
            int count = 0;
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(arr1[i][j]==arr2[i][j])
                    {
                        count++;
                    }
                }
            }
            if (count==totalValues)
            {
                System.out.println("two arrays are equal");
                System.out.println("array 1 :");
                for(int i=0;i<row;i++)
                {
                    for (int j:arr1[i])
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                System.out.println("array 2 :");
                for(int i=0;i<row;i++)
                {
                    for (int j:arr2[i])
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("two arrays are not equal");
            }
        }
        else
        {
            System.out.println("the two arrays are not equal");
        }
    }
}
