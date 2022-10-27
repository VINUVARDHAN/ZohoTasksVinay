package com.learn.java.C7_FinalStaticVarArgumentsOverriding;

public class OverridingIMP {
    public static void main(String args[])
    {
        A1 a = new B1();
        a.m();
    }
}
class A1{
    //Even though it is not executed in line 7 it should be present to avoid CTE
    void m()
    {
        System.out.println("cndsjcbd");
    }
}
class B1 extends A1{
    void m()
    {
        System.out.println("sbdcjduscv");
    }
}
