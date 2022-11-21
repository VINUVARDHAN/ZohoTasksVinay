package com.learn.java.C17_Collections;

import java.util.*;

class Collections1 {
    public static void main(String[] args) {
             //repeat     , no sort
        ArrayList<Integer> list = new ArrayList<>(1);    //repeat     , no sort   ,reference
        
        
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println(list);
        Collections.rotate(list, 2);
        System.out.println("After rotation :");
        System.out.println(list);
        System.out.println(Collections.max(list));
    }
}
