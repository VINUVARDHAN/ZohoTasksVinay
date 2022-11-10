//$Id$
package com.learn.java.C12_EnumAnnotationAutoboxing;

public class WrapperClass1 {
    public static void main(String[] args) {
        //Using wrapper class we can access the different methods that can't be accessed by 
        //using normal primitive data types
        
        //Example
        Integer val = new Integer(10);
        System.out.println(val.sum(10, 20));
        System.out.println(val);
    }
}
