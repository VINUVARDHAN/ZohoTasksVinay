//$Id$
package com.learn.java.C17_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String args[]) {
        // Create a hash map.
        HashMap<Integer, Table> hm = new HashMap<>();
        hm.put(2, new Table("vinay",2,12));
        hm.put(3, new Table("kumar",1,11));
        hm.put(1, new Table("vardh",3,10));
        for(Map.Entry<Integer,Table> tb:hm.entrySet())
        {
            System.out.println(tb.getKey()+": "+tb.getValue().id+", "+tb.getValue().standard+", "+tb.getValue().name);
        }
        for(Object ob:hm.entrySet())
        {
            System.out.println(ob);
        }
        //To check key present in hash map or not
        System.out.println(hm.containsKey(4));
        System.out.println(hm.containsValue("sds"));
    }
}

class Table{
    String name;
    int id;
    int standard;
    Table (String name,int id,int standard)
    {
        this.name = name;
        this.id = id;
        this.standard = standard;
    }
}