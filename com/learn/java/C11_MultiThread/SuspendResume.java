package com.learn.java.C11_MultiThread;

public class SuspendResume extends Thread {
    String val;

    SuspendResume(String val) {
        this.val = val;
    }

    public static void main(String[] args) throws InterruptedException {

        SuspendResume t1 = new SuspendResume("o");
        SuspendResume t2 = new SuspendResume("  t");
        // Using suspend we can pause the thread and play using resume method

        // but resume method cannot be used for the stop method.
        t1.start();

        t2.start();

        // t2.suspend();
        // t2.resume();
        // t1.stop();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + val);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
