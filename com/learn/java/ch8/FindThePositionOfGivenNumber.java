package com.learn.java.ch8;

public class FindThePositionOfGivenNumber {
public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6};
    int value = 4;
    for(int i=0;i<a.length;i++)
    {
    	if (a[i]==value)
    	{
    		System.out.println("the index value of "+value+" is : "+i);
            break;
    	}
    }
}
}
