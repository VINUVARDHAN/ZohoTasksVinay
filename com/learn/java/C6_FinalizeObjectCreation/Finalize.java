package com.learn.java.C6_FinalizeObjectCreation;

public class Finalize {
	public static void main(String args[])
	{
		ChildFinalize ch = new ChildFinalize();
		ch = null;
		System.gc();
		boolean b ;
	}
	
}
class ParentFinalize
{
	public void finalize()
	{
		System.out.println("Parent class finalize method");
	}

}
class ChildFinalize extends ParentFinalize{
	//protected void finalize() {
	//	System.out.println("child class finalize method");
	//}
}