package com.learn.java.C12_EnumAnnotationAutoboxing;

public class PassByValue {
public static void main(String[] args) {
    Integer a = new Integer(10);
    method(a);
    System.out.println(a);
}
static void method(int a)
{
    a = 0;  
}
}
