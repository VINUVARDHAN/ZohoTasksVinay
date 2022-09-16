package com.learn.java.Sep16;

public class GarbageCollection {
    public static void main(String[] args) {
        Test t = new Test(10);
        t = null;
        System.gc();
    }
}
