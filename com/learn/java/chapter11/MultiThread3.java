package com.learn.java.chapter11;

public class MultiThread3 extends Thread {
    private String s;
    MultiThread3(String s)
    {
        this.s = s;
    }
    
    public static void main(String args[]) {
        MultiThread3 c1 = new MultiThread3("one");
        MultiThread3 c2 = new MultiThread3("two");
        // By using actual name of the method it will be executed after completion of
        // previous one
        c1.run();
        System.out.println("--------------");
        c2.run();
        System.out.println("--------------");

        // By using the start it will be executed without blocking
        // the execution of the next statement until it's completion
        
        c2.start();
        System.out.println(Thread.currentThread().getName());
        try {
            c2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        c1.start();
        
        //start method cannot be called more than once
        //  c2.start
        System.out.println(Thread.currentThread().getName());
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+"   "+this.s);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("interupted");
            }
        }
    }
}
