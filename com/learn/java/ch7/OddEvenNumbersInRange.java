package com.learn.java.ch7;
public class OddEvenNumbersInRange {
    public static void main(String[] args) {
        int size  =50;
        int j=0;
        int []even =new int[size];
        int k=0;
        int []odd = new int[size];
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                even[j]=i;
                j++;
            }
            else{
                odd[k]=i;
                k++;
            }
        }
        System.out.println("even");
        for(int i:even)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("odd");
        for(int i:odd)
        {
            System.out.print(i+" ");
        }
    }
}
