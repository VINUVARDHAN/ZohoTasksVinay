//$Id$
package com.learn.java.C14_Generics;

public class Basics1 {
public static void main(String[] args) {
    Sample1<String> type1 = new Sample1<String>("String");
    Sample1<Integer> type2 = new Sample1<Integer>(213);
    System.out.println("I am string "+":"+ type1.value);
    System.out.println("I am Integer "+":"+ type2.value);
    Integer i = 10;
    System.out.println(i.getClass());
}
}
class Sample1<TT>{
    TT value ;
    Sample1(TT val)
    {
        this.value = val;
        
    }
}
