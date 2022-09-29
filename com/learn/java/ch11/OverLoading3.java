package com.learn.java.ch11;
/*
 * Grand Parent Class
 */
class GParent{
	int a;
	static int b;
    GParent(){
        System.out.println("G Parent constructor ");
    }
    {
    	a= 10;
    	b = 20;
        System.out.println("box grand ");
    }
	static {
		System.out.println("grand static");
	}
    void mg1()
    {
        System.out.println("method mg1");
    }
    void m()
    {
    	System.out.println("common method in g");
    }
    void g()
    {
        System.out.println("method g");
        m();
        this.m();
    }
}

/*
 * Parent Class
 */
class Parent extends GParent{
    Parent(){
        System.out.println("Parent Class constructor");
    }
    {
        System.out.println("box parent");
    }
    static {
		System.out.println("parent static");
	}
    void p1()
    {
        System.out.println("method p1");
    }
    void m()
    {
    	System.out.println("common method in p");
    }
    void p()
    {
        System.out.println("method p");
        g();
    }
}

/*
 * Child Class
 */
class Child extends Parent{
    Child(){
        System.out.println("Child Class constructor");
    }
    {
        System.out.println("box child");
    }
    static {
		System.out.println("child static");
	}
    GParent g = new GParent();
    void c1()
    {
        System.out.println("method c1");
    }
    void m()
    {
    	System.out.println("common method in c");
    }
    void c()
    {
        System.out.println("method c");
        g();
    }
}

/*
 * Main class
 */
public class OverLoading3{
    public static void main(String[] args) {
        Child c = new Child();
       c.c();
        //Parent p = new Parent();
        //p.p();
        //GParent g = new GParent();
        //g.g();
    }
}