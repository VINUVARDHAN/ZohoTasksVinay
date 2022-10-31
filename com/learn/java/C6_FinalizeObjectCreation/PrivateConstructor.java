package com.learn.java.C6_FinalizeObjectCreation;

public class PrivateConstructor {
    public static void main(String[] args) {
        Test.m();
    }
}

class Test {
    private Test() {
        System.out.println("constructor");
    }

    static void m() {
        System.out.println("Static method onlyx");
    }
}
