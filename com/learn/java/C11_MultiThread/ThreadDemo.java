package com.learn.java.C11_MultiThread;

class ThreadDemo {
    int value;

    public static void main(String[] args) {
        ThreadDemo mt = new ThreadDemo();
        Producer pd = new Producer(mt);
        Consumer cd = new Consumer(mt);

    }

    static boolean check = false;

    synchronized void getValue() {
        while (check) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("consumer : " + value);
        check = true;
        notify();
    }

    synchronized void setValue(int value) {
        while (!check) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.value = value;
        System.out.println("producer : " + this.value);
        check = false;
        notify();
    }
}

class Producer extends Thread {
    ThreadDemo mt;

    Producer(ThreadDemo mt) {
        this.mt = mt;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 1;
        while (true) {
            mt.setValue(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer extends Thread {
    ThreadDemo mt;

    Consumer(ThreadDemo mt) {
        this.mt = mt;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        int i = 1;
        while (true) {
            i++;
            mt.getValue();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}