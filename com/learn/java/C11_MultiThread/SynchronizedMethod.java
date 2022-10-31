package com.learn.java.C11_MultiThread;
//Synchronized method is used to lock an object for any shared resource.

//When a thread invokes a synchronized method, it automatically acquires 
//the lock for that object and releases it when the thread completes its task.
class SynchronizedMethod{
    public static void main(String[] args) {
        SynchronizedMethod d = new SynchronizedMethod();
        ClassThread c= new ClassThread(d);
        c.start();
        ClassThread c1= new ClassThread(d);
        c1.start();
    }
    synchronized void support()
    {
        for(int i =1;i<=5;i++)
        {
            System.out.println(i*10);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
   }
}

class ClassThread extends Thread{
    SynchronizedMethod t;
    ClassThread(SynchronizedMethod t)
    {
        this.t = t;
    }
    public void run() {
        //at this point t is an object locked by the synchronized support method
        //Note : You can also synchronize the below line using the keyword

        t.support();
    }
    
}