package com.learn.java.ch8;

public class SplitArrayIntoTwoArray {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2,8,7,6};
        int length = a.length;
        int[] even = new int[length];
        int[] odd = new int[length];
        int j=0,k=0;
        for(int i:a)
        {
            if(i%2==0)
            {
                even[j] = i;
                j++;
                continue;
            }
            else{
                odd[k] = i;
                k++;
                continue;
            }
        }
        System.out.println("even :");
        for(int i=0;i<length;i++)
        {
            if(even[i]!=0)
            {
                System.out.println(even[i]);
            }
        }
        System.out.println("odd :");
        for(int i=0;i<length;i++)
        {
            if(odd[i]!=0)
            {
                System.out.println(odd[i]);
            }
        }
    }
}
