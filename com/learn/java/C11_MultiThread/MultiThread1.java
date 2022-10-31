package com.learn.java.C11_MultiThread;

public class MultiThread1 extends Thread {
    private String s;

    MultiThread1(String s) {
        this.s = s;
    }

    public static void main(String args[]) throws InterruptedException {
        MultiThread1 c1 = new MultiThread1("one");
        MultiThread1 c2 = new MultiThread1("two");
        // By using actual name of the method it will be executed after completion of
        // previous one
        // c1.run();
        System.out.println("--------------");
        // c2.run();
        System.out.println("--------------");

        // By using the start it will be executed without blocking
        // the execution of the next statement until it's completion

        method(c2);
        c2.join();
        method(c1);

//        they perform like pause and play for threads
//        c2.suspend();
//        Thread.sleep(1000);
//        c2.resume();

        // started method cannot be called more than once
        // c2.start
    }

     static void method(MultiThread1 m) {
            m.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "   " + this.s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interupted");
            }
        }
    }
}
