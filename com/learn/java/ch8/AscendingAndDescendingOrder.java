package com.learn.java.ch8;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescendingOrder {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2,8,7,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("type 1 for ascending order \n type 2 for descending order");
        int order = sc.nextInt();
        switch(order)
        {
            case 1:
            for(int i=0;i<a.length-1;i++)
                {
                    for(int j=i+1;j<a.length;j++)
                    {
                        if (a[i]>a[j])
                        {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(a));
                break;
            case 2:
            for(int i=0;i<a.length-1;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if (a[i]>a[j])
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            int length = a.length;
            int b[] = new int[length];
            for(int i=0,j=length-1;i<length;i++,j--)
            {
                b[j] = a[i];
            }
            System.out.println(Arrays.toString(b));
            break;
        }
        sc.close();
    }
}
