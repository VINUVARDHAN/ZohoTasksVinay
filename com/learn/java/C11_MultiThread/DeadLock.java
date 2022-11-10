//$Id$
package com.learn.java.C11_MultiThread;

public class DeadLock {
    public static void main(String[] args) {
        String res1 = "resource1";
        String res2 = "resource2";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (res1) {
                    System.out.println("Thread 1 for resource 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    // Present inside another synchronized block
                    synchronized (res2) {
                        System.out.println("Thread 1 for resource 2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (res2) {
                    System.out.println("Thread 2 for resource 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    synchronized (res1) {
                        System.out.println("Thread 2 for resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
