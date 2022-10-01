package com.learn.java.chapter8;

class poly{
	void nothing()
	{
		System.out.println("sjdsidbkbvc");
	}
}
class Polygon extends poly{
	public void nothing(){
		System.out.println("super can be used ");
	}
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	}

	class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
	      Polygon p1 = new Polygon() {
	         public void display() {
	        	 //super keyword 
	        	 super.nothing();
	        	 //this keyword
	        	 this.nothing();
	        	 //no keyword
	        	 nothing();
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      p1.display();
	   }
	}

	public class AnomalyClass {
	   public static void main(String[] args) {
		   //using anomaly class
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();
	       //without that
	       Polygon p = new Polygon();
	       p.display();
	       
	   }
	}
