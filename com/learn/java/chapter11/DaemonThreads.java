package com.learn.java.chapter11;

public class DaemonThreads extends Thread {
    public static void main(String[] args) {
        
        //They are used to support the user thread and delete when there is no user threads
        DaemonThreads t = new DaemonThreads();
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}
