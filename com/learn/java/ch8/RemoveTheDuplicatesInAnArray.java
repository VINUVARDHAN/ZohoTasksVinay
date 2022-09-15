package com.learn.java.ch8;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveTheDuplicatesInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array : ");
        int size = sc.nextInt();
        System.out.println("enter the values of array");
        int [] a = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    a = RemoveTheArrayValueByIndex(a, j);
                    j--;
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
    public static int[] RemoveTheArrayValueByIndex(int[] arr,int index)
	{
         int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
	}
}
