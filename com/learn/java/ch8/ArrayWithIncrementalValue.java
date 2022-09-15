package com.learn.java.ch8;
import java.util.*;
public class ArrayWithIncrementalValue {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
		System.out.println("enter the size of an array : ");
		int size = sc.nextInt();
		int a[];
		a = new int[size];
		System.out.println("enter the values : ");
		a[0] = sc.nextInt();
		System.out.println(a[0]+"--->"+"a["+0+"]");
		for(int i=1;i<size;i++)
		{
			a[i] = sc.nextInt();
			if (a[i]>a[i-1])
			{
				System.out.println(a[i]+"--->"+"a["+i+"]");
			}
			else
			{
				System.out.println("the next value must be greater than previous enter again : ");
				i--;
			}
		}
        sc.close();
    }
}
