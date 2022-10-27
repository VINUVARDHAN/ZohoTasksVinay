package com.learn.java.C10_ExceptionHandling;

import java.io.*;

class Parent{    
    void msg()throws Exception {  
      System.out.println("parent method");  
    }    
  }    
      
  class ExceptionOverridingIMP extends Parent{    
    void msg()throws ArithmeticException {    
      System.out.println("child method");    
    }    
    
    public static void main(String args[]){    
        ExceptionOverridingIMP p = new ExceptionOverridingIMP();    
     
     p.msg();    
    }    
  }    
