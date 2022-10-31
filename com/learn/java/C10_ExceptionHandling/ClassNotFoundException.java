package com.learn.java.C10_ExceptionHandling;

class ClassNotFoundException {
    private static final String DRIVER_CLASS = "sun.awt.HKSCS";

    public static void main(String[] args) throws Exception {
        System.out.println("Loading class ");
        Class c = Class.forName(DRIVER_CLASS);
        System.out.println("Class loaded ");
        System.out.println(c);
    }
}
