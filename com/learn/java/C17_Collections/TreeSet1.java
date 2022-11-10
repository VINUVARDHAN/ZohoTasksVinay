//$Id$
package com.learn.java.C17_Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        // Auto sort
        // No duplicates
        // No Null Insertion
        
        TreeSet<String> s = new TreeSet<String>();
        s.add("D");
        s.add("B");
        s.add("A");
        s.add("C");
        s.add("D");
        //s.add(null);
        System.out.println(s);
    }   
}
