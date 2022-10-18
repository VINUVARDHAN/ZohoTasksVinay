package com.learn.java.chapter11;

class MultiThread1 {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            MultiThread2 m = new MultiThread2(i);
            m.start();
        }
    }
}

//You can use Thread if you have no extending class or can
// use implements Runnable
final class MultiThread2 extends Thread implements Runnable{
    private int j = 1;
    MultiThread2(int i)
    {
        this.j = i;
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" from thread "+j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
//thread can be in any order because it executes simultaneously