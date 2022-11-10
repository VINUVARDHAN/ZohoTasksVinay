//$Id$
package com.learn.java.Algorithm;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(6);
        int size = list.size();
        for(int i=1;i<size;i++)
        {
            for(int k=0;k<i;k++)
            {
                if(list.get(i)<list.get(k))
                {
                    int temp = list.get(i);
                    list.set(i, list.get(k));
                    list.set(k, temp);
                }
            }
        }
        System.out.println(list);
    }
}
