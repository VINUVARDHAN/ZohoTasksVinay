package com.learn.java.chapter11.ThreadSafe;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeUsingAtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        Increment3 incri = new Increment3();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                for(int i=0;i<1000;i++)
                {
                    incri.incri(); 
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                for(int i=0;i<1000;i++)
                {
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
class Increment3{
    AtomicInteger count = new AtomicInteger();
    public void incri()
    {
        count.incrementAndGet();
    }
}
