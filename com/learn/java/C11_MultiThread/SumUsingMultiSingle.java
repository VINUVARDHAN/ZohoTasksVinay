//$Id$
package com.learn.java.C11_MultiThread;

public class SumUsingMultiSingle {
    public static void main(String[] args) throws InterruptedException {
        int i = 1000000000;
        long start1 = System.nanoTime();
        Calculate1 c1 = new Calculate1(1, i / 2);
        Calculate1 c2 = new Calculate1(i / 2 + 1, i);
        c1.start();
        c1.join();
        c2.start();
        c2.join();
        long end1 = System.nanoTime();
        long execution1 = end1 - start1;
        System.out.println(execution1 + "    By Multithread");
        System.out.println(c2.sum + "   By Multithread");
        long start2 = System.nanoTime();
        long sum = 0;
        for (long j = 1; j <= i; j++) {
            sum += j;
        }
        long end2 = System.nanoTime();
        long execution2 = end2 - start2;
        System.out.println(execution2 + "    By Singlethread");
        System.out.println(sum + "   By Singlethread");
    }

}

class Calculate1 extends Thread {
    private long start;
    private long end;
    volatile long total = 0;
    static long sum = 0;

    Calculate1(long start, long end) {
        this.start = start;
        this.end = end;
    }

    private void calculate() {
        for (long i = this.start; i <= this.end; i++) {
            total += i;
        }
    }

    public void run() {

        calculate();
        sum += total;
    }
}