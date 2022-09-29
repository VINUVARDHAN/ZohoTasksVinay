package com.learn.java.extra;
public class GrandParentChild{
	public static void main(String[] args) {
		Child c = new Child();
	}
}
class GrandP{
	GrandP(){
		System.out.println("Grandparent class");
	}
	//Increasing visibility private->protected->public
	private void m()
	{

	}
}
class Parent extends GrandP{
	Parent(){
		System.out.println("Parent class");
		//super.m();
	}
	protected void m(){
		
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child class");
		super.m();
	}
	public void m(){

	}
}	
