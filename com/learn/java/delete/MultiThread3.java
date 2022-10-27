package com.learn.java.delete;
public class MultiThread3 extends Thread {
    private String s;


    public static void main(String args[]) throws InterruptedException {
        MultiThread3 c1 = new MultiThread3();
        MultiThread3 c2 = new MultiThread3();


        c2.start();
        
        c2.wait();
        c1.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "   ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("interupted");
            }
        }
    }
}
