//$Id$
package com.learn.java.C12_EnumAnnotationAutoboxing;

//Enum can be present inside or outside of class
enum WEEK {
    mon(1), tue(2), thu(3), fri(6), sat(5), sun(4);
    int val;
    WEEK(int val)
    {
        this.val = val;
    }
}

public class Enumeration1 {
    public static void main(String[] args) {
        for(WEEK w:WEEK.values())
        {
            System.out.println(w);
        }
        System.out.println("+++++++++++++++++++");
        for(WEEK w:WEEK.values())
        {
            System.out.println(w.val);
        }
        System.out.println("+++++++++++++++++++");
        System.out.println(WEEK.fri);
        System.out.println(WEEK.valueOf("fri"));
        System.out.println(WEEK.fri.ordinal());
        System.out.println("+++++++++++++++++++");
        
        //
        WEEK1.values();
    }
}


enum WEEK1{
    mon,tue;
    WEEK1()
    {
        //super();
        System.out.println("constructor called once but returned 3 times");
    }
}

