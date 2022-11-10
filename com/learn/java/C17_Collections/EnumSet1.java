//$Id$
package com.learn.java.C17_Collections;

import java.util.EnumSet;

public class EnumSet1 {
    //cannot add the value which is not present in enum
    
    public static void main(String[] args) {
        EnumSet<SIZE>  set = EnumSet.of(SIZE.big);
        set.add(SIZE.extra);
        System.out.println(set);
    }
}
enum SIZE{
    big,small,medium,extra
}