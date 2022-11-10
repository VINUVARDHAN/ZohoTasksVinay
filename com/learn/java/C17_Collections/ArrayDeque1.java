//$Id$
package com.learn.java.C17_Collections;
import java.util.*;
class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(6);
        System.out.println(list);
    }
}
