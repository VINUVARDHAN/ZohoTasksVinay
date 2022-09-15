package com.learn.java.ch8;

public class SumOfOddAndEvenIndexValueInArray {
public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6};
    int oddTotal=0,evenTotal=0;
    for(int i=0,j=1;i<a.length;i +=2,j +=2)
    {
        evenTotal +=a[j];
        oddTotal +=a[i];
    }
    System.out.println("total value of odd index : "+oddTotal);
    System.out.println("total value of even index : "+evenTotal);
}
}
