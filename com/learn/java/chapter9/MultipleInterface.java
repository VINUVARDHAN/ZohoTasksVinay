package com.learn.java.chapter9;

public class MultipleInterface implements IF1,TF2{
    MultipleInterface()
    {
        System.out.println("constructor");
    }
    public void method()
    {
        System.out.println("method");
    }
    public void method(int val)
    {
    	System.out.println("method with para");
    }
    public static void main(String[] args) {
        MultipleInterface i = new MultipleInterface();
        i.method();
        i.method(12);
    }
    //1. all the methods in implemented field must be public except for 
    //local method
    //void method1(){}

}

interface IF1{
    void method();
    //void method1();
   //2. all the method declared in the interface must be have body in 
   //the implemented class other wise it will give error
}
interface TF2{
     void method(int i);
}