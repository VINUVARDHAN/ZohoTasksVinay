package com.learn.java.C11_MultiThread;

class WaitNotify {
    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify();
        T t1 = new T(wn, "1");
        T t2 = new T(wn, " 2");
        T t3 = new T(wn, "  3");
        t1.start();
        t2.start();
        t3.start();
    }

    synchronized void method(String t) {
        if (t == "1") {
            try {
                this.wait();
                System.out.println("1 is Notified");
            } catch (InterruptedException e) {
            }
        } 
        else if (t == " 2") {
            try {
                this.wait();
                System.out.println("2 is Notified");
            } catch (InterruptedException e) {
            }
        } 
        else if (t == "  3") {
            this.notifyAll();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * 10 + "  " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class T extends Thread {
    WaitNotify wn;
    String t;

    T(WaitNotify wn, String t) {
        this.wn = wn;
        this.t = t;
    }

    public void run() {
        wn.method(t);
    }
}