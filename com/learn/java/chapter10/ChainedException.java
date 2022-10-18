package com.learn.java.chapter10;

public class ChainedException {
public static void main(String args[])
{
   try {
       C c = new C();
       c.method();
   }
   catch(ArithmeticException a)
   {
       System.out.println("exception is : "+ a);
       //we are calling cause of the exception
       System.out.println("Cause of this exception is : "+a.getCause());
   }
}

}
//C is considered as an exception so it needs to be extended with other exceptions 
class C extends NullPointerException{
    void method()
    {
        ArithmeticException e = new ArithmeticException();
        //We initialized the cause of arithmetic exception is Class C
        e.initCause( new C());
        throw e;
    }
}