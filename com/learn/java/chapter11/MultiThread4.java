package com.learn.java.chapter11;

public class MultiThread4 {
    public static void main(String[] args) {
        MultiThread5 m = new MultiThread5();
        MultiThread5 n = new MultiThread5();
        m.start();
        n.start();
    }
}

class MultiThread5 extends Thread {
    static int i = 10;
    public void run() {
        i++;
        System.out.println(i);
    }
}

// The answer can be 11,12 or 12,11 or 12,12(Both incremented at same time)