package com.learn.java.ch8;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int [] a = {10,8,7,5,3,1,2,4,6,9};
        if(a.length>=2){
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
        System.out.println(a[a.length-2]);
    }
    else
    {
        System.out.println("array length should be grater than 2");
    }

    }
}
