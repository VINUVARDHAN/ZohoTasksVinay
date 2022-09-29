package com.learn.java.chapter7;

public class ObjectAsParameter {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println(a.val);
        a.m(a);
        System.out.println(a.val);
    }
}
class A1{
    int val = 10;
    A1 m(A1 a)
    {
        a.val = 20;
        return a;
    }
}