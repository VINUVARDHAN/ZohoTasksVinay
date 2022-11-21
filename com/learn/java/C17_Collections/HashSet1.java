//$Id$
package com.learn.java.C17_Collections;

import java.util.HashSet;
import java.util.TreeSet;

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
        
//        TreeSet<Table2> hs = new TreeSet<Table2>();
//        hs.add(new Table2("vinay",600));
//        hs.add(new Table2("manja",40));
//        hs.add(new Table2("kumar",50));
//        
//        for(Table2 t:hs)
//        {
//            System.out.println(t.id+" , "+t.name);
//        }
    }
}
class Table2{
    int id;
    String name;
    Table2(String name,int id)
    {
        this.id = id;
        this.name = name;
    }
}
