package com.learn.java.C11_MultiThread;

public class WaitNotify2 {
    public static void main(String[] args) {
        WaitNotify2 w = new WaitNotify2();
        Thread12 t1 = new Thread12(w,"1");
        Thread22 t2 = new Thread22(w," 2");
        t1.start();
        t2.start();
    }
    void method(String t)
    {
        if(t=="1")
        {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else {
            notify();
        }
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+"  ; "+t);
        }
    }
}
class Thread12 extends Thread{
    WaitNotify2 w1;
    String str;
    Thread12(WaitNotify2 w1,String str)
    {
        this.str = str;
        this.w1 = w1;
    }
    public void run() {
        w1.method(str);
    }
}
class Thread22 extends Thread{
    WaitNotify2 w1;
    String str;
    Thread22(WaitNotify2 w1,String str)
    {
        this.str = str;
        this.w1 = w1;
    }
    public void run() {
        w1.method(str);
    }
}
