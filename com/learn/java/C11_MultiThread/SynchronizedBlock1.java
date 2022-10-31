package com.learn.java.C11_MultiThread;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        SynchronizedBlock1 d = new SynchronizedBlock1();
        ClassThread1 c1= new ClassThread1(d,"1");
        c1.start();
        ClassThread1 c2= new ClassThread1(d,"  2");
        c2.start();
    }
     void support(SynchronizedBlock1 t,String val)
    {
             //In this it waits till the execution of the upper statements because 
             // it needs to synchronize that peace of code inside it .
             synchronized (t)
             {

                 for(int i =1;i<=5;i++)
                 {
                     System.out.println(i*10+ "  " +val);
                     try {
                         Thread.sleep(500);
                     } catch (InterruptedException e) {}
                   
                 }
                 
             }
             
         }
}

class ClassThread1 extends Thread{
    SynchronizedBlock1 t;
    String val;
    ClassThread1(SynchronizedBlock1 t,String val)
    {
        this.t = t;
        this.val = val;
    }
     public void run() {
        //at this point t is an object locked by the synchronized support method
        t.support(t,val);
    }
    
}
