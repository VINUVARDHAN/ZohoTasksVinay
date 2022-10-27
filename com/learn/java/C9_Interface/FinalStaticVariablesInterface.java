package com.learn.java.C9_Interface;

class FinalStaticVariablesInterface implements A {
	public static void main(String args[])
	{
		A a = new FinalStaticVariablesInterface();
		//Interface variables are by default static and final
		//a.VAL = 20;
	}
}
interface A{
	 int VAL = 10;
}