package com.learn.java.ch8;

import java.util.Scanner;

public class CreateAndPrint2DArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the size of row : ");
        int row = sc.nextInt();
        System.out.println("enter the size of column : ");
        int col = sc.nextInt();
        System.out.println("enter the values : ");
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
