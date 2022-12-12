////$Id$
//package com.learn.java.C12_EnumAnnotationAutoboxing;
//
//public class Enumeration2 {
//    enum example1{
//        one{
//            String m1()
//            {
//            return "one";
//            }
//        },
//        two{
//            String m2()
//            {
//            return "two";
//            }
//        };
//        
//        // ???????????
//        String m1() {
//        }
//        
//        //if you declare abstract class outside then 
//        // all method must be implemented in individual constants
//        
//    }
//    public static void main(String[] args) {
//        //This will print mon
//        System.out.println(example1.one.m1());
//        //But if we don't declare the m1 method in enum it 
//        //will show error example : call m2 it shows error
//    }
//}
