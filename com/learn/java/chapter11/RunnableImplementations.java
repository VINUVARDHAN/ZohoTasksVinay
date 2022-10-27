package com.learn.java.chapter11;

public class RunnableImplementations implements Runnable{
public static void main(String[] args) {
    RunnableImplementations t = new RunnableImplementations();
    Thread t2 = new Thread(t);
    t2.start();
}
public void run()
{
    System.out.println("How to create a object for the thread class using runnable implementations");
}
}