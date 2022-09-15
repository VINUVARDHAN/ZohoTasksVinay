package com.learn.java.ch8;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1,row2,col1,col2 ;
        System.out.println("enter the row and col value of the first table");
        row1 = sc.nextInt();
        col1  =sc.nextInt();
        System.out.println("enter the row and col value of the second table");
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        if(col1==row2)
        {
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            System.out.println("enter the vale of first array");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("enter the vale of second array");
            for(int i=0;i<row2;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("the multiplication of two table will be : ");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    int total =0;
                    for(int k=0;k<col1;k++)
                    {
                        total +=a[i][k]*b[k][j];
                    }
                    System.out.print(total + " ");  
                }
                System.out.println();
            }
        }
        else{
            System.out.println("column value of table one is not equal to row value of table two");
        }
        sc.close();
    }
}
