package com.learn.java.chapter11.ThreadSafe;

public class SafeUsingSynchronized {
    //the method make only one thread to access where others to wait till completion
    public static void main(String[] args) throws InterruptedException {
        Increment1 incri = new Increment1();
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
class Increment1{
    int count = 0;
    public synchronized void incri()
    {
        count++;
    }
}
