package com.learn.java.C7_FinalStaticVarArgumentsOverriding;




public class VariableArguments {
	public static void main(String args[])
	{
		/**
		 * if one method contain array parameter
		 * and another method contain variable argument parameter
		 * then it will give error of ambiguity
		 */
		VarArg va = new VarArg();
		va.integer(10);
		int [] arr = {1,2,3,4,5,6,7,8};
		va.arrays(arr);
		va.vararg();
	}
}

class VarArg{
	void integer(int i)
	{
		System.out.println("integer");
	}
	void arrays(int [] i)
	{
		System.out.println("integer array");
	}
	void vararg(int ... i)
	{
		System.out.println("Variable argument");
	}
	void object(Object ... obj)
	{
		
	}
}