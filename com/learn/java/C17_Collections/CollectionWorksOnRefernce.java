//$Id$
package com.learn.java.C17_Collections;

import java.util.ArrayList;

public class CollectionWorksOnRefernce {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("D");
        s.add("B");
        s.add("A");
        s.add("C");
        s.add("D");
        System.out.println("Before Removing ele");
        System.out.println(s);
        remove(s);
        System.out.println("After Removing main function");
        System.out.println(s);
    }
    private static void remove(ArrayList<String> s)
    {
        s.remove(0);
        System.out.println("After Removing ele in remove function");
        System.out.println(s);
    }
}
