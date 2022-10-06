package com.learn.java.chapter9;

public class InterfaceVariableValueCantBeChanged implements A {
	public static void main(String args[])
	{
		A a = new InterfaceVariableValueCantBeChanged();
		//interface variables are by default static and final
		//a.val = 20;
	}
}
interface A{
	 int val = 10;
}