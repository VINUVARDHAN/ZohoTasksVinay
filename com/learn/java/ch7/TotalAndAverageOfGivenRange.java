package com.learn.java.ch7;
import java.util.*;
public class TotalAndAverageOfGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start point");
        int start = sc.nextInt();
        System.out.println("enter the end point");
        int end  = sc.nextInt();
        int total = 0;
        int range = end-start;
        if(end>start)
        {
        for(int i=start;i<end;i++)
        {
            total +=i;
        }
        System.out.println("total value : "+total);
        System.out.println("average value : "+(int)(total/range));
    }
    else{
        System.out.println("end value must be more than start");
    }
        sc.close();
    }
}
