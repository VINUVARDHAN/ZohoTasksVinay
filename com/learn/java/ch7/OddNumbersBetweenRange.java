package com.learn.java.ch7;
public class OddNumbersBetweenRange {
    public static void main(String[] args) {
        int size  =50;
        int k=0;
        int []odd = new int[size];
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                odd[k]=i;
                k++;
            }
        }
        System.out.println("odd");
        for(int i:odd)
        {
            System.out.println(i+" ");
        }
    }
}
