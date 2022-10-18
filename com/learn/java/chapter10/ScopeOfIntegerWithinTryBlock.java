package com.learn.java.chapter10;
import java.lang.*;
public class ScopeOfIntegerWithinTryBlock {
    public static void main(String args[])
    {
        m();
        int i=20;
        try {
            i=10/0;
        }
        catch(Exception e)
        {
            
        }
        System.out.println(i);
    }
    static void m() throws RuntimeException
    { 
        //FileReader fileReader = new FileReader(s);  
    }
}
