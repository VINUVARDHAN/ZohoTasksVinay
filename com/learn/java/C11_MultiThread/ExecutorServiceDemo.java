//$Id$
package com.learn.java.C11_MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        ChildClassofThread[] child1 = { new ChildClassofThread("vinay"),
                new ChildClassofThread("manja"),
                new ChildClassofThread("kumar"),
                new ChildClassofThread("kavit"),
                new ChildClassofThread("powde"),
                new ChildClassofThread("pajam"),
        };
        for (int i = 0; i < 6; i++) {
            service.submit(child1[i]);
        }
        service.shutdown();
    }
}

class ChildClassofThread extends Thread {
    String name;

    ChildClassofThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("name is : " + this.name + "  and thread name is : " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}