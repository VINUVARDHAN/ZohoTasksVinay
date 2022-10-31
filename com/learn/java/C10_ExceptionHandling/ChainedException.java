package com.learn.java.C10_ExceptionHandling;
import java.io.IOException;
import java.util.*;
class ChainedException {
public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   int a;
   System.out.print("Enter the value of a : ");
   a = sc.nextInt();
   try {
       a = 10/a;
       System.out.println(a);
   }
   catch(ArithmeticException e){
       //Initiating the cause of the exception 
       e.initCause(new IOException());
       System.out.println(e);
       //getting the cause of the exception 
       System.out.println("Cause of the exception is : "+e.getCause());
   }
}
}