package com.learn.java.check;

class A {
    void m1() throws Exception{
        System.out.println("A");
    }
}

class B {
    void m2() throws Exception {
        System.out.println("B");
        A a = new A();
        a.m1();
    }
}

class C {
    void m3() throws Exception {
        System.out.println("C");
        B b = new B();
        b.m2();
    }
}

class check{
    public static void main(String args[]) throws Exception
    {
        C c = new C();
        c.m3();
    }
}