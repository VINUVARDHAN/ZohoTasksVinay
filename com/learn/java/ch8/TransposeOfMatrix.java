package com.learn.java.ch8;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row ,col;
        System.out.println("enter the row and col");
        row = sc.nextInt();
        col = sc.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j];
            }
        }
        System.out.println("normal matrix : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose matrix : ");
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
