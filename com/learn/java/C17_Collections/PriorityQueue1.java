//$Id$
package com.learn.java.C17_Collections;

import java.util.    PriorityQueue;

public class PriorityQueue1 {
public static void main(String[] args) {
 // duplicate, no auto sort, Default it will be min heap
    
    PriorityQueue<Integer> list = new     PriorityQueue<Integer>();
    list.add(5);
    list.add(3);
    list.add(3);
    list.add(1);
    list.add(2);
    list.add(4);
    list.add(4);
    System.out.println(list);
    
    PriorityQueue<String> list1 = new     PriorityQueue<String>();
    list1.add("D");
    list1.add("A");
    list1.add("E");
    list1.add("C");
    list1.add("B");
    list1.add("G");
    list1.add("F");
    System.out.println(list1);
    
}
}
 