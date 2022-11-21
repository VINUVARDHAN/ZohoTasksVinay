//$Id$
package com.learn.java.C17_Collections;

import java.util.TreeSet;

public class TreeSetString {
    public static void main(String[] args) {
        
        
        //Tree set does not support user defined classes
        
        
        TreeSet<Table3> set = new TreeSet<Table3>();
        set.add(new Table3("vvvvvb"));
        set.add(new Table3("vvvvvc"));
        set.add(new Table3("vvvvva"));
        for(Table3 t:set)
        {
            System.out.println(t.val);
            
        }
    }
}
class Table3{
    String val;
    Table3(String val)
    {
        this.val = val;
    }
}
