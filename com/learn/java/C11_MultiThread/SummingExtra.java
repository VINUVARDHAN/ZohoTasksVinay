//$Id$
package com.learn.java.C11_MultiThread;

public class SummingExtra {
    public static void main(String[] args) throws InterruptedException {
        long i = 1000000000;
        long k = i / 4;
        long start1 = System.nanoTime();
        Calc c1 = new Calc(1, k);
        Calc c2 = new Calc(k + 1, k * 2);
        Calc c3 = new Calc(k * 2 + 1, k * 3);
        Calc c4 = new Calc(k * 3 + 1, i);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c1.join();
        c2.join();
        c3.join();
        c4.join();
        long end1 = System.nanoTime();
        System.out.println(c2.total);
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

class Calc extends Thread {
    private long start;
    private long end;
    volatile long total = 0;
    static long sum = 0;

    Calc(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (long i = this.start; i <= this.end; i++) {
            total+=i;
        }
    }
}