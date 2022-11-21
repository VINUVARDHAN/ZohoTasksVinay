//$Id$
package com.learn.java.C17_Collections;

import java.util.*;

class Testing {
    public static void main(String args[]) {
        // Create a hash map.
        ArrayList<String> a = new ArrayList<String>();
        a.add("A");
        a.add("C");
        a.add("C");
        a.add("B");
        Collections.sort(a);
        System.out.println(a);
    }
}