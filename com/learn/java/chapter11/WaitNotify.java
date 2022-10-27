package com.learn.java.chapter11;

public class WaitNotify {
    public static void main(String[] args) {
        WaitNotify d = new WaitNotify();
        ClassThread2 c1= new ClassThread2(d,"1");
        c1.start();
        ClassThread2 c2= new ClassThread2(d," 2");
        c2.start();
        ClassThread2 c3= new ClassThread2(d,"  3");
        c3.start();
    }
     void support(WaitNotify t,String val)
    {
         //WAIT can be used within the synchronized block or method
             synchronized (t)
             {
                 if (val=="1")
                 {
                     System.out.println("Wait for thread c1");
                     try {
                        t.wait();
                    } catch (InterruptedException e) {}
                 }
                 else if(val==" 2")
                 {
                     System.out.println("Wait for thread c1");
                     try {
                         t.wait();
                     } catch (InterruptedException e) {}
                 }
                 else if(val=="  3"){
                     // NotifyAll will break the wait for c1 and c2 objects 
                     //t.notifyAll();
                     
                     // Notify Will break the wait for only first object c1
                     System.out.println("Breaking wait");

                     t.notify();
                 }
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

class ClassThread2 extends Thread{
    WaitNotify t;
    String val;
    ClassThread2(WaitNotify t,String val)
    {
        this.t = t;
        this.val = val;
    }
     public void run() {
        t.support(t,val);
    }
    
}
