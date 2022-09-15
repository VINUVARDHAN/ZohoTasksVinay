package com.learn.java.ch8;

import java.util.Arrays;

public class ConcatinationOfTwoArrays {
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int [] b ={5,6,7,8};
        int [] c = new int[a.length+b.length];
        for(int i=0,j=0;i<a.length;i++,j++)
        {
            c[j] = a[i];
        }
        for(int k=0,j=b.length;k<b.length;j++,k++)
        {
            c[j] = b[k];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
