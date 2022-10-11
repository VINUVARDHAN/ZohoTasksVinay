package com.learn.java.chapter9;


/**
 * Interface inside class .
 * Interface can be public private protected if nested
 */
class OuterClass {
	 static interface StaticInnerInterface1{
		
	}
     interface InnerInterface1{
		
	}
}

/**
 * Interface inside another interface .
 * interface by default will be public and abstract
 */
interface OuterInterface{
	 static interface StaticInnerInterface2{
		
	}
     interface InnerInterface2{
		
	}
}

//This is how to implement the nested interface
class NestedInterface implements OuterClass.StaticInnerInterface1,OuterInterface.StaticInnerInterface2{
	public static void main(String args[])
	{
		//creating reference variable for inner interface
		OuterClass.StaticInnerInterface1 i = new NestedInterface();
	}
} 