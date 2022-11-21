//$Id$
package com.learn.java.C11_MultiThread;

public class SummingUsingThreadLocal {
    public static void main(String[] args) throws InterruptedException {
        long i = 1000000000;
        long start1 = System.nanoTime();
        Cal c1 = new Cal(1, i/2);
        Cal c2 = new Cal(i/2 + 1,i);
        c1.start();
        c2.start();
        c1.join();
        c2.join();
        long end1 = System.nanoTime();
        System.out.println(Cal.sum);
        System.out.println((end1 - start1) + " : time taken for multi method");
        long start2 = System.nanoTime();
        long sum = 0;
        for (long j = 1; j <= i; j++) {
            sum += j;
        }
        System.out.println(sum);
        long end2 = System.nanoTime();
        System.out.println((end2 - start2) + " : time taken for single method");
    }
}

class Cal extends Thread {
    private long start;
    private long end;
    ThreadLocal<Long> total = new ThreadLocal<Long>();
    static volatile long sum = 0;

    Cal(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        total.set((long) 0);
        for (long i = this.start; i <= this.end; i++) {
            total.set(total.get() + i);
        }
        sum += total.get();
    }
}