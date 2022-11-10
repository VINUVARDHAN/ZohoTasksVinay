//$Id$
package com.learn.java.C14_Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<TypeInt> val1 = new ArrayList<TypeInt>();
        val1.add(new TypeInt(10));
        val1.add(new TypeInt(20));
        System.out.println("Printing the list of Integer");
        print(val1);
        List<TypeBoolean> val2 = new ArrayList<TypeBoolean>();
        val2.add(new TypeBoolean(true));
        val2.add(new TypeBoolean(false));
        System.out.println("Printing the list of Boolean");
        print(val2);
    }

//Use of Wild Card for the class objects which extend same class
    static void print(List<? extends Types> val) {
        for (Types v : val) {
            v.print();
        }
    }
}

abstract class Types {
    abstract void print();
}

class TypeInt extends Types {
    int m;

    TypeInt(int m) {
        this.m = m;
    }

    void print() {
        System.out.println(m);
    }
}

class TypeBoolean extends Types {
    boolean m;

    TypeBoolean(boolean m) {
        this.m = m;
    }

    void print() {
        System.out.println(m);
    }

}