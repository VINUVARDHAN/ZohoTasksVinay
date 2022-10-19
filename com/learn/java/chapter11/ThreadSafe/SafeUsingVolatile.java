package com.learn.java.chapter11.ThreadSafe;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeUsingVolatile {
    public static void main(String[] args) throws InterruptedException {
        Increment2 incri = new Increment2();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incri.incri();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incri.incri();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(incri.count);
    }
}

class Increment2 {
    volatile int count;

    public void incri() {
        count++;
    }
}
