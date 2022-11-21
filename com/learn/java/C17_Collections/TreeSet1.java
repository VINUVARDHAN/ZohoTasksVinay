//$Id$
package com.learn.java.C17_Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        // Auto sort
        // No duplicates
        // No Null Insertion
        
        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(5);
        s.add(90);
        s.add(10);
        s.add(1);
        s.add(12);
        s.add(4);
        s.add(33);
        s.add(2);
        System.out.println(s);
        //These properties are implemented in NavigableSet
        
//        //s.add(null);
//        System.out.println(s);
//        //return E if present or after greater E
//        System.out.println(s.ceiling(6));
//      //return A if present or before lesser E
//        System.out.println(s.floor(7));
//        //pollfirst remove first and return
//        System.out.println(s.pollLast());
//        System.out.println(s);
            }   
}
