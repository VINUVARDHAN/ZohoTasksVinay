package com.learn.java.chapter8;

abstract class Editor
{
  abstract void show();
}

abstract class Author extends Editor
{
  abstract void print();
}

class Office extends Author
{
  void show()
  {
    System.out.println("Editor method");
  }
  protected void print()
  {
    System.out.println("Author method");
  }
  void m1()
  {
	  System.out.println("method m1");
  }
}
//abstract class contains main method
public abstract class AbstractClass1
{
  public static void main(String[] args)
  {
    Editor ed = new Office();
    ed.show();
    //ed.m1();
    
    Author au = new Office();
    au.print();	
    
    Office of = new Office();
    of.m1();
    of.print();
    
    //we cannot create a object for abstract class
    //Editor c1 = new Editor();
    //Author c2 = new Author();
  }
}
