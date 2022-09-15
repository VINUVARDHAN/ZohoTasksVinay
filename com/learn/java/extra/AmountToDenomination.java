package com.learn.java.extra;

import java.util.Scanner;

public class AmountToDenomination {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = 2135647527;
    long vv = v(amount);
    long tv = t(amount);
    if (tv<vv)
    {
    	System.out.println("tv   "+(vv-tv));
    }
    else {
    	System.out.println("vv   "+(tv-vv));
    }
    sc.close();
}
static long v(int amount)
{
	long startTime = System.nanoTime(); 
	int notes[] = {2000,500,100,50,10,1};
    int count[] = new int[6];
    for(int i=0;i<6;i++)
    {
        while(amount>=notes[i])
        {
            count[i] ++;
            amount -=notes[i];
        }
        System.out.println(count[i] +" * "+notes[i]);
    }
    System.out.println("Time taken by v: " + (System.nanoTime() - startTime) + "ms"); 
	System.out.println("--------------");
    return  (System.nanoTime() - startTime) ;
}
static long t(int amount)
{
	long startTime = System.nanoTime(); 
	int notes[] = {2000,500,100,50,10,1};
    int count[] = new int[6];
	for(int i=0;i<6;i++)
	{
		count[i] = amount/notes[i];
		amount -= count[i]*notes[i];
		System.out.println(count[i] +" * "+notes[i]);
	}
    System.out.println("Time taken by t: " + (System.nanoTime() - startTime) + "ms"); 
	System.out.println("--------------");
	return  (System.nanoTime() - startTime) ;
}
}
