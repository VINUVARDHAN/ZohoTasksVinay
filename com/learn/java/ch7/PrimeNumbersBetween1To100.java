package com.learn.java.ch7;

public class PrimeNumbersBetween1To100 {
    public static void main(String[] args) {
        int size  =50;
        int k=0;
        int []even = new int[size];
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                even[k]=i;
                k++;
            }
        }
        System.out.println("even");
        for(int i:even)
        {
            System.out.println(i+" ");
        }
    }
}
