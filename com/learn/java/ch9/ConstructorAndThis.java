package com.learn.java.ch9;

public class ConstructorAndThis {
	public static void main(String args[])
	{
		//default constructor 
		Default def = new Default();
		System.out.println(def.name);
		
		//no arg constructor
		NoArg noArguments = new NoArg();
		System.out.println(noArguments.name);
		
		//par constructor
		Par par = new Par("vardhan");
		System.out.println(par.name);
	}
}
//class with default constructor
class Default{
	String name;
}
//class with no arg constructor
class NoArg{
	String name;
	NoArg()
	{
		this.name = "vinay";
	}
}
//class with par constructor
class Par{
	String name;
	Par(String name)
	{
		this.name = name;
	}
}