package com.learn.java.C9_Interface;

/**
 * In the below example the implementation is done is parent class instead of child class
 * But in case implementation is done in child class means the parent class 
 * cannot access those implementations .
 */

class ImplementAndExtend extends C11 implements IF1{

	public static void main(String args[])
	{
		//implemented method 
		IF1 i = new ImplementAndExtend();
		i.m();
		//Extended method
		ImplementAndExtend c = new ImplementAndExtend();
		c.m();
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

}

class C11{
	
}

interface IF1{
	void m();
}