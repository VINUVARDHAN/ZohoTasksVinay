package com.learn.java.delete;

class delete3 extends Thread{
    String n = "jasbdcd";
    public static void main(String[] args) {
        delete3 d = new delete3();
        System.out.println(d);
        d.M();
        d.start();
    }
     void M()
    
    {
        System.out.println("dfdghjkhv");
    }
     public void start()
     {
         System.out.println("start");
     }
     public void run()
     {
         System.out.println("run");
     }
         
     
}