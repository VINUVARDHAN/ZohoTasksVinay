//$Id$
package com.learn.java.C17_Collections;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {

        // No duplicate , Auto sort , No index

        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        // Removes the element by value
        System.out.println(set);
        set.remove(1);
        System.out.println(set.contains(12));
        HashSet<String> hs = new HashSet<String>();
        // Add elements to the hash set.
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
    }
}
