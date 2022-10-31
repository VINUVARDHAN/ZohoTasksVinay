package com.learn.java.C10_ExceptionHandling;

import java.io.*;
import java.util.*;

class ParentToChildIMP {
    public static void main(String[] args) {
        final C1 c = new C1();
        try {
            c.m1();
        } catch (Throwable e) {
            System.out.println(e);
        }
    }

}

class C1 {
    void m1() throws Throwable {
        C2 c = new C2();
        c.m2();
    }
}

class C2 {
    void m2() throws IOException {
        C3 c = new C3();
        c.m3();
    }
}

class C3 extends IOException {
    void m3() throws C3 {
        throw new C3();
    }
}

/**
 * As we go up the parent exception is involved in handling but
 * at last it will be printing only the specified exception (C3)
 * in the above example .
 */
