package com.learn.java.C17_Collections;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        // POINTS :
        // 1 : Duplicates
        // 2 : No Auto sorting
        // 3 : Slow than the Linked list
        ArrayList<String> a = new ArrayList<String>();
        a.add("A");
        a.add("C");
        a.add("C");
        a.add("B");
        // you can store null-values
        a.add(null);
        a.add(null);
        System.out.println(a);
        ArrayList<String> b = a;
        b.set(0, "D");
        System.out.println("After modify");

        // Here due to change in value of a, b is also changed
        System.out.println(a);
        System.out.println(b);

        // To over come this we can use clone method
        ArrayList<String> c = (ArrayList<String>) a.clone();
        a.set(0, "A");
        System.out.println("After modify");
        System.out.println(a);
        System.out.println(c);

        // Reversing
        System.out.println("Reversing the list");
        System.out.println("Before reverse : " + a);
        Collections.reverse(a);
        System.out.println("After reverse : " + a);

        // 2D ArrayList
        System.out.println("2D Array");
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<ArrayList<Integer>>();
        // one place allocation
        list2D.add(new ArrayList<Integer>());
        // list2D.get(0).add(1);
        list2D.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
        System.out.println(list2D);
    }
}
