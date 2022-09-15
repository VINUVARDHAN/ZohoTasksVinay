package com.learn.java.ch8;

import java.util.Arrays;

public class ReversingArray {
public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6};
    int length = a.length;
    int b[] = new int[length];
    for(int i=0,j=length-1;i<length;i++,j--)
    {
        b[j] = a[i];
    }
    System.out.println("a : ");
    System.out.println(Arrays.toString(a));
    System.out.println("b : ");
    System.out.println(Arrays.toString(b));
}
}
