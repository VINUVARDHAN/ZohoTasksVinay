package com.learn.java.C10_ExceptionHandling;

class NoClassDefFoundError {
public static void main(String[] args) {
    CheckClass c = new CheckClass();
    c.m();
}
}

class CheckClass {
void m()
{
    System.out.println("Method");
}
}
