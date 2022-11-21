//$Id$
package com.learn.java.C11_MultiThread;

public class SummingNNumbers {
public static void main(String[] args) throws InterruptedException {
    long[] k = {10,100,1000,10000,10000,100000,1000000,10000000,100000000,1000000000};
    long[] multi = new long[10];
    long[] single = new long[10];
    long[] multival = new long[10];
    long[] singleval = new long[10];
    int m=0;
    for (long i :k)
    {
    long start1 = System.nanoTime();
    Calculate c1 = new Calculate(1,i/2);
    Calculate c2 = new Calculate(i/2+1,i);
    c1.start();
    c1.join();
    c2.start();
    c2.join();
    long end1 = System.nanoTime();
    long execution1 = end1 - start1;
    multi[m]=execution1;
    multival[m] = c2.sum;
    long start2 = System.nanoTime();
    long sum = 0;
    for(long j = 1;j<=i;j++)
    {
        sum+=j;
    }
    singleval[m] = sum;
    long end2 = System.nanoTime();
    long execution2 = end2 - start2;
    single[m]=execution2;
    m++;
    }
    System.out.println("MultiThread   :   SingleThread");
    for (int i=0;i<10;i++)
    {
        System.out.println(multival[i]+"   "+singleval[i]);
    }
    System.out.println();
    for (int i=0;i<10;i++)
    {
        System.out.println(multi[i]+"  -  "+single[i] +" = "+(multi[i]-single[i]));
    }
    
}
}

class Calculate extends Thread{
    private long start ;
    private long end ;
    volatile long total=0;
    static long sum = 0;
    static private int m = 0;
    Calculate(long start,long end )
    {
        this.start = start;
        this.end = end;
    }
    private void calculate()
    {
        for(long i=this.start;i<=this.end;i++)
        {
            total +=i;
        }
    }
    public void run()
    {
        if(m%2==0)
        {
            sum = 0;
        }
        calculate();
        sum +=total;
        m++;
    }
}