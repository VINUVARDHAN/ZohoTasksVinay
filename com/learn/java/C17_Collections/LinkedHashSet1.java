//$Id$
package com.learn.java.C17_Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        // Removes the element by value
        System.out.println(set);
        //Remove elements by value
        set.remove(2);
        System.out.println(set);
    }
}
