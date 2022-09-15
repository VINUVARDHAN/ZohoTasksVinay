package com.learn.java.ch8;

import java.util.Arrays;

public class FindAndReplace {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        int findingValue = 4;
        int ReplacingValue = 10;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==findingValue)
            {
                a[i] = ReplacingValue;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
