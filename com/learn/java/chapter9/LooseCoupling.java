package com.learn.java.chapter9;

interface Parent  
{  
     void foo();  
}  
  
class A1 implements Parent  
{  
    // parameterized constructor  
    A1(int x, int y)  
    {  
          
    }  
      
    public void foo()  
    {  
        System.out.println("In the foo method of class A.");  
    }  
}  
  
class B1 implements Parent  
{  
    public void foo()  
    {  
        System.out.println("In the foo method of class B.");  
    }  
}  
  
public class LooseCoupling  
{  
  
// main method   
public static void main(String argvs[])   
{  
// creating an object of class B  
B1 obj = new B1();  
obj.foo();  
}  
}  