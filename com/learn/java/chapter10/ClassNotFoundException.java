package com.learn.java.chapter10;

public class ClassNotFoundException {
    private static final String DRIVER_CLASS = "sun.awt";

    public static void main(String[] args) throws Exception {
        System.out.println("Loading sun ");
        Class.forName(DRIVER_CLASS);
        System.out.println("Loaded sun ");
    }
}
