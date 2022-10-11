package com.learn.java.chapter9;

/**
 * In the below example the implementation is done is parent class instead of child class
 */

class ImplementAndExtend extends C1 implements IF1{
	public static void main(String args[])
	{
		//implemented method 
		IF1 i = new ImplementAndExtend();
		i.m();
		//Extended method
		ImplementAndExtend c = new ImplementAndExtend();
		c.m();
	}

}

class C1{
	public void m()
	{
		System.out.println("Method in class C1");
	}
}

interface IF1{
	void m();
}


