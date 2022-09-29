package com.learn.java.chapter8;

public class Inheritance{
    public static void main(String[] args) {
        OuterClass c = new OuterClass();
        OuterClass.InnerClass c1 = c.new InnerClass();
        OuterClass.InnerClass c2 = c.new InnerClass();
    }
}
    class OuterClass{
    OuterClass()
    {
        System.out.println("outer class constructor");
    }
    void methodOfOuterClass()
    {
        System.out.println("Outer class method");
        class InnerClassInsideMethod{
            InnerClassInsideMethod(){
                System.out.println(" inner method class constructor");
            }
        }
        InnerClassInsideMethod i  = new InnerClassInsideMethod();
    }
      class InnerClass{
        InnerClass()
        {
            System.out.println("inner class method");
        }
        void m()
        {

        }
    }
}
