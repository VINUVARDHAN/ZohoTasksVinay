package com.learn.java.chapter11;

public class MoreThanOneThreadClass {
public static void main(String[] args) throws InterruptedException {
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    t1.start();
    t1.suspend();
    t2.start();
    t2.join();
    System.out.println("nievnfr");
    t1.resume();
}
}

class Thread1 extends Thread{
     public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println(i+"  from   Thread 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
class Thread2 extends Thread{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println(i+"  from   Thread 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}