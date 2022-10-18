package com.learn.java.chapter11;

public class Test extends Thread{
public static void main(String[] args) {
    Test t = new Test();
    try {
        t.wait();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
