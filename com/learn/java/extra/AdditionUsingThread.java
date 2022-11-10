package com.learn.java.extra;

class AdditionUsingThread{
    public static void main(String[] args) throws InterruptedException {
        int a =10000;
        long s1 = System.nanoTime();
        Th t1 = new Th(1,a/2);
        Th t2 = new Th(a/2+1,a);
        t1.start();
        t2.start();
        t2.join();
        System.out.println(Th.total+"   Result by thread");
        long e1 = System.nanoTime();
        long diff1 = e1-s1;
        System.out.println(diff1);
        long s2 = System.nanoTime();
        int sum = 0;
        for(int i=1;i<=a;i++)
        {
            sum +=i;
        }
        System.out.println(sum+"   Result by normal loop");
        long e2 = System.nanoTime();
        long diff2 = e2-s2;
        System.out.println(diff2);
    }
}
class Th extends Thread{
    int start,end;
    static long total=0;
    public Th(int start,int end) {
        this.start = start;
        this.end = end;
    }
    public void run()
    {
        cal();
    }
    void cal()
    {
        for(int i =start;i<=end;i++)
        {
            total+=i;
        }
    }
}