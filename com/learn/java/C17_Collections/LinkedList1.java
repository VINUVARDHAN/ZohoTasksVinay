//$Id$
package com.learn.java.C17_Collections;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

public class LinkedList1 {
    public static void main(String[] args) {
        // duplicate, no auto sort,
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(list);
        Collections.sort(list);
        list.addFirst(6);
        none(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        // 2D
        LinkedList<LinkedList<Integer>> list2D = new LinkedList<LinkedList<Integer>>();
        list2D.add(new LinkedList<Integer>());
        list2D.add(new LinkedList<Integer>(Arrays.asList(3, 4, 6)));
        System.out.println(list2D);
    }

    static void none(LinkedList<Integer> list) {
        list.addLast(90);
    }
}
