//$Id$
package com.learn.java.C11_MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SummingUsingCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long i = 1000000000;
        // -------------------------------
        long start1 = System.nanoTime();
        FutureTask[] store = new FutureTask[2];

        Callable clble1 = new CallableImp(1, i / 2);
        Callable clble2 = new CallableImp(i / 2 + 1, i);

        store[0] = new FutureTask(clble1);
        store[1] = new FutureTask(clble2);

        Thread th1 = new Thread(store[0]);
        Thread th2 = new Thread(store[1]);

        th1.start();
        th2.start();
        
        //extra
        
        long total1 = (long) store[0].get();
        long total2 = (long) store[1].get();
        System.out.println(total1 + total2);
        
        long end1 = System.nanoTime();
        long execution1 = end1 - start1;
        System.out.println(execution1 + "    By Multithread");
        // -------------------------------
    }

}

class CallableImp implements Callable {
    private long start;
    private long end;
    volatile long total = 0;

    CallableImp(long start, long end) {
        this.start = start;
        this.end = end;
    }

    private void calculate() {
        for (long i = this.start; i <= this.end; i++) {
            total += i;
        }
    }

    @Override
    public Object call() throws Exception {
        this.calculate();
        return total;
    }
}
