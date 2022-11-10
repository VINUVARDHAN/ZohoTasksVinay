package com.learn.java.C17_Collections;

import java.util.*;

class Collections1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeset = new TreeSet<>();           //no repeat  , auto sort
        LinkedList<Integer> linkedlist = new LinkedList<>();  //repeat     , no sort
        Stack<Integer> stack = new Stack<>();                 //repeat     , no sort
        ArrayList<Integer> arraylist = new ArrayList<>(1);    //repeat     , no sort   ,reference
        HashSet<Integer> hashset = new HashSet<>();           //no repeat  , auto sort
        
        
        //TreeSet
        String [] a= {"E","D","C","A","B"};
        treeset.add(1);
        treeset.add(2);
        treeset.add(5);
        treeset.add(4);
        treeset.add(3);
        treeset.add(1);
        System.out.println(treeset);
        arraylist.add(23);
        arraylist.add(23);
        arraylist.add(2389);
        System.out.println(arraylist.size());
        
    }
}
