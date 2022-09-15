package com.learn.java.ch8;

import java.util.Arrays;

public class CopyingArrayToAnotherArray {
public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6};
    int b[] = a.clone();
    System.out.println("a : "+Arrays.toString(a));
    System.out.println("b : "+Arrays.toString(b));
}
}
